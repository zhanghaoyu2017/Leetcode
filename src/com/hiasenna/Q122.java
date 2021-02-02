package com.hiasenna;

/**
 * @ClassName Q122
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/9-16:45
 * @Version 1.0
 **/
public class Q122 {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if (n == 0 || prices == null) return 0;
        if (n == 1) return 0;
//        dp[i][j] 表示：在下标为 i 的这一天，用户手上持股状态为 j 所获得的最大利润。
        int[][] dp = new int[n][2]; // 0 没有股票 1 持有股票
        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        for (int i = 1; i < n; i++) {
            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1]+prices[i]); //今天没有持有股票 两种情况
            dp[i][1] = Math.max(dp[i-1][1],dp[i-1][0]-prices[i]) ;// 今天持有股票 也是两种情况
        }
        return dp[n-1][0];
    }
    public int maxProfit2(int[] prices) {
        int res = 0;
        int len = prices.length;
        for (int i = 0; i < len - 1; i++) {
            int diff = prices[i + 1] - prices[i];
            if (diff > 0) {
                res += diff;
            }
        }
        return res;
    }
}
