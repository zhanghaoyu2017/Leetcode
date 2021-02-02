package com.hiasenna;

/**
 * @ClassName Q123
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/9-16:55
 * @Version 1.0
 **/
public class Q123 {
    public int maxProfit(int[] prices) {
            if (prices == null || prices.length == 0) {
                return 0;
            }
            int len = prices.length;

            int min = prices[0];            // 初始化的前半部分最小买入价格
            int max = prices[len - 1];      // 初始化的后半部分最大卖出价格

            int maxPro1 = 0;                // 前半部分的每天最大利润
            int maxPro2 = 0;                // 后半部分的每天最大利润

            int[] profit1 = new int[len];   // 前半部分的利润表
            int[] profit2 = new int[len];   // 后半部分的利润表

            for (int i = 0; i < len; i++) {

                // 1. 计算 从前往后 的利润
                if (prices[i] <= min) {
                    min = prices[i];
                } else {
                    maxPro1 = Math.max(maxPro1, prices[i] - min);
                }
                profit1[i] = maxPro1;

                //  2. 计算 从后往前 的利润
                if (prices[len - 1 - i] >= max) {
                    max = prices[len - 1 - i];
                } else {
                    maxPro2 = Math.max(maxPro2, max - prices[len - 1 - i]);
                }
                profit2[len - i - 1] = maxPro2;
            }

            // 3. 计算利润和，求最大值
            int res = Integer.MIN_VALUE;
            for (int i = 0; i < len; i++) {
                res = Math.max(res, profit1[i] + profit2[i]);
            }
            return res;
    }

    public int maxProfit2(int[] prices) {
        int len = prices.length;
        if (len < 2) {
            return 0;
        }

        // dp[i][j] ，表示 [0, i] 区间里，状态为 j 的最大收益
        // j = 0：什么都不操作
        // j = 1：第 1 次买入一支股票
        // j = 2：第 1 次卖出一支股票
        // j = 3：第 2 次买入一支股票
        // j = 4：第 2 次卖出一支股票

        // 初始化
        int[][] dp = new int[len][5];
        dp[0][0] = 0;
        dp[0][1] = -prices[0];

        // 3 状态都还没有发生，因此应该赋值为一个不可能的数
        for (int i = 0; i < len; i++) {
            dp[i][3] = Integer.MIN_VALUE;
        }

        // 状态转移只有 2 种情况：
        // 情况 1：什么都不做
        // 情况 2：由上一个状态转移过来
        for (int i = 1; i < len; i++) {
            // j = 0 的值永远是 0
            dp[i][0] = 0;
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i]);
            dp[i][2] = Math.max(dp[i - 1][2], dp[i - 1][1] + prices[i]);
            dp[i][3] = Math.max(dp[i - 1][3], dp[i - 1][2] - prices[i]);
            dp[i][4] = Math.max(dp[i - 1][4], dp[i - 1][3] + prices[i]);
        }
        // 最大值只发生在不持股的时候，因此来源有 3 个：j = 0 ,j = 2, j = 4
        return Math.max(0, Math.max(dp[len - 1][2], dp[len - 1][4]));
    }

}
