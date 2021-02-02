package com.hiasenna;

/**
 * @ClassName Q415
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/3-9:54
 * @Version 1.0
 **/
public class Q415 {
    public static void main(String[] args) {
        System.out.println(addStrings("9", "99"));

    }

    public static String addStrings(String num1, String num2) {
        StringBuilder res = new StringBuilder("");
        int i = num1.length() - 1, j = num2.length() - 1, carry = 0;
        while (i >= 0 || j >= 0) {
            int n1 = i >= 0 ? num1.charAt(i) - '0' : 0;
            int n2 = j >= 0 ? num2.charAt(j) - '0' : 0;

            int temp = n1 + n2 + carry;
            carry = temp / 10;
            res.append(temp % 10);
            i--;
            j--;
        }
        if (carry > 0) res.append(carry);
        return res.reverse().toString();
    }
}
