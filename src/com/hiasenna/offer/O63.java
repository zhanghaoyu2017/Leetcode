package com.hiasenna.offer;

/**
 * @ClassName O63
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/7/26-17:52
 * @Version 1.0
 **/
public class O63 {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if (n==0 || prices==null) return 0;
        int[] dp = new int[n];
        dp[0] = 0;
        int min = prices[0];
        for (int i =1;i<n;i++){
            min = Math.min(min,prices[i]);
            dp[i] = Math.max(dp[i-1],prices[i]-min);
        }
        return dp[n-1];
    }
}
