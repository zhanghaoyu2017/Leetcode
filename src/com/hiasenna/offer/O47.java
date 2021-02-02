package com.hiasenna.offer;

/**
 * @ClassName O47
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/7/26-11:22
 * @Version 1.0
 **/
public class O47 {
    public int maxValue(int[][] grid) {
        int m = grid.length;
        if (m == 0 || grid == null) return 0;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        dp[0][0] = grid[0][0];
        for (int i = 1; i < m; i++)
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        for (int j = 1; j < n; j++)
            dp[0][j] = dp[0][j - 1] + grid[0][j];
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
            }
        }
        return dp[m - 1][n - 1];
    }

    public int[] printNumbers(int n) {
        int end = (int) Math.pow(10, n) - 1;
        int[] res= new int[end];
        for (int i =0;i<end;i++){
            res[i] = i+1;
        }
        return res;
    }
}
