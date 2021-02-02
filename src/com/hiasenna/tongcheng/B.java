package com.hiasenna.tongcheng;

/**
 * @ClassName B
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/31-20:47
 * @Version 1.0
 **/
public class B {
    public static void main(String[] args) {
//        double m = Math.sqrt(101);
        String a = "160";
        int k = a.charAt(1);
        System.out.println(k-'0');

    }

    /**
     *
     * @param a int整型
     * @param b int整型
     * @return int整型
     */
    public static int question (int a, int b) {
        // write code here
        for (int k = 1;k<500;k++){
            int m = (int)Math.sqrt(k+a);
            if (m*m==a+k){
                int n = (int)Math.sqrt(k+b);
                if (n*n==b+k){
                    return k;
                }
            }

        }
        return -1;
    }
}
