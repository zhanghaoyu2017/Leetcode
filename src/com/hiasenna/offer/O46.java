package com.hiasenna.offer;

/**
 * @ClassName O46
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/7/27-16:04
 * @Version 1.0
 **/
public class O46 {

    public static int translateNum(int num) {
        if (num < 10) return 1;
        char[] c = String.valueOf(num).toCharArray();
        int[] dp = new int[c.length];
        dp[0] = 1;
        int n = (c[0] - '0') * 10 + (c[1] - '0');
        if (n > 9 && n < 26) {
            dp[1] = 2;
        } else {
            dp[1] = 1;
        }
        for (int i = 2; i < c.length; i++) {
            n = (c[i-1] - '0') * 10 + (c[i] - '0');
            if (n > 9 && n < 26) {
                dp[i] = dp[i-2]+dp[i-1];
            } else {
                dp[i] = dp[i-1];
            }
        }
        return dp[c.length-1];
    }

    public static void main(String[] args) {
        char c = 'A';
        System.out.println('0' + '0');
    }
}
