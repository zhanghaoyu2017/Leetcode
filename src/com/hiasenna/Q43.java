package com.hiasenna;

/**
 * @ClassName Q43
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/6-10:35
 * @Version 1.0
 **/
public class Q43 {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        // 保存计算结果
        String res = "0";
        // num2 逐位与 num1 相乘
        for (int i = num2.length() - 1; i >= 0; i--) {
            int carry = 0;
            // 保存 num2 第i位数字与 num1 相乘的结果
            StringBuilder temp = new StringBuilder();
            // 补 0
            for (int j = 0; j < num2.length() - 1 - i; j++) {
                temp.append(0);
            }
            int n2 = num2.charAt(i) - '0';

            // num2 的第 i 位数字 n2 与 num1 相乘
            for (int j = num1.length() - 1; j >= 0 || carry != 0; j--) {
                int n1 = j < 0 ? 0 : num1.charAt(j) - '0';
                int product = (n1 * n2 + carry) % 10;
                temp.append(product);
                carry = (n1 * n2 + carry) / 10;
            }
            // 将当前结果与新计算的结果求和作为新的结果
            res = addStrings(res, temp.reverse().toString());
        }
        return res;
    }

    /**
     * 对两个字符串数字进行相加，返回字符串形式的和
     */
    public String addStrings(String num1, String num2) {
        StringBuilder builder = new StringBuilder();
        int carry = 0;
        for (int i = num1.length() - 1, j = num2.length() - 1;
             i >= 0 || j >= 0 || carry != 0;
             i--, j--) {
            int x = i < 0 ? 0 : num1.charAt(i) - '0';
            int y = j < 0 ? 0 : num2.charAt(j) - '0';
            int sum = (x + y + carry) % 10;
            builder.append(sum);
            carry = (x + y + carry) / 10;
        }
        return builder.reverse().toString();
    }

    public String multiply2(String num1, String num2) {
            /**
             num1的第i位(高位从0开始)和num2的第j位相乘的结果在乘积中的位置是[i+j, i+j+1]
             例: 123 * 45,  123的第1位 2 和45的第0位 4 乘积 08 存放在结果的第[1, 2]位中
             index:    0 1 2 3 4

                    1 2 3
             *        4 5
             ---------
                    1 5
                  1 0
                0 5
             ---------
                0 6 1 5
                  1 2
                0 8
              0 4
             ---------
             0 5 5 3 5
             这样我们就可以单独都对每一位进行相乘计算把结果存入相应的index中
             **/

            int n1 = num1.length()-1;
            int n2 = num2.length()-1;
            if(n1 < 0 || n2 < 0) return "";
            int[] mul = new int[n1+n2+2];

            for(int i = n1; i >= 0; --i) {
                for(int j = n2; j >= 0; --j) {
                    int bitmul = (num1.charAt(i)-'0') * (num2.charAt(j)-'0');
                    bitmul += mul[i+j+1]; // 先加低位判断是否有新的进位

                    mul[i+j] += bitmul / 10; // 下一个数的进位
                    mul[i+j+1] = bitmul % 10;
                }
            }

            StringBuilder sb = new StringBuilder();
            int i = 0;
            // 去掉前导0
            while(i < mul.length-1 && mul[i] == 0)
                i++;
            for(; i < mul.length; ++i)
                sb.append(mul[i]);
            return sb.toString();
        }
    public String multiply3(String num1, String num2) {
        int n1 = num1.length()-1;
        int n2 = num2.length()-1;

        if (n1 < 0 || n2 <0) return "";
        int[] res = new int[n1+n2+2];
        for (int i = n1;i>=0;i--){
            for (int j = n2;j>=0;j--){
                int mul = (num1.charAt(i) - '0')* (num2.charAt(j)-'0');
                mul += res[i+j+1];
                res[i+j] += mul / 10;
                res[i+j+1] = mul%10;
            }
        }
        StringBuilder sb = new StringBuilder();
        int i =0;
        while(i < res.length-1 && res[i] == 0)
            i++;
        for(; i < res.length; ++i)
            sb.append(res[i]);
        return sb.toString();

    }

}
