package com.hiasenna;

/**
 * @ClassName Q7
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/7/27-22:54
 * @Version 1.0
 **/
public class Q7 {
    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }
    public static int reverse(int x) {
        if (x==0) return 0;
        if(x > 0){
            String a = String.valueOf(x);
            char[] c = a.toCharArray();
            String s = "";
            for (int i = c.length-1;i>=0;i--){
                s += c[i];
            }
            long res = Long.parseLong(s);
            return (int) res == res ? (int) res : 0;
        }else {
            String a = String.valueOf(x);
            char[] c = a.toCharArray();
            String s = "";
            for (int i = c.length-1;i>=1;i--){
                s += c[i];
            }

            long res = Long.parseLong(s);
            return (int) res == res ? (int) -res : 0;
        }
    }


    public int reverse2(int x) {
        int res = 0;
        while (x != 0) {
            int t = x % 10;
            int newRes = res * 10 + t;
            //如果数字溢出，直接返回0
            if ((newRes - t) / 10 != res)
                return 0;
            res = newRes;
            x = x / 10;
        }
        return res;
    }
    public int reverse3(int x) {
        long res = 0;
        while (x != 0) {
            res = res * 10 + x % 10;
            x /= 10;
        }
        return (int) res == res ? (int) res : 0;
    }
}
