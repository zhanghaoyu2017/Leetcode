package com.hiasenna.puyuan;

/**
 * @ClassName 跳格子
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/9/17-21:29
 * @Version 1.0
 **/
public class C {
    //dp
    public static int skip(int n) {
        if (n == 0 || n == 1) return n;
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(skip(4));
    }
}
