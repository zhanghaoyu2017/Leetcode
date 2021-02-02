package com.hiasenna.offer;

/**
 * @ClassName O14
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/7/26-18:30
 * @Version 1.0
 **/
public class O14 {
    public int cuttingRope(int n) {
        if (n == 0) return 0;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            for (int j = 1; j < i; j++) {
                dp[i] = Math.max(dp[i], Math.max(j * (i - j), j * dp[i - j]));
            }
        }
        return dp[n];
    }
}
