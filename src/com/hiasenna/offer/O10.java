package com.hiasenna.offer;

/**
 * @ClassName O10
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/7/26-15:24
 * @Version 1.0
 **/
public class O10 {
    public static   void main(String[] args) {
        System.out.println(fib(3));
    }
    public static   int fib(int n) {
        if (n==0) return 0;
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2;i<=n;i++){
            dp[i] = (dp[i-1]+dp[i-2])%1000000007;
        }
        return dp[n];
    }

    public int numWays(int n) {
        if (n==0) return 0;
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2;i<=n;i++){
            dp[i] = (dp[i-1]+dp[i-2])%1000000007;
        }
        return dp[n];
    }
}
