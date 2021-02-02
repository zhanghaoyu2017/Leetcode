package com.hiasenna;

/**
 * @ClassName Q64_Minimum_Path_Sum
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/7/23-9:11
 * @Version 1.0
 **/
public class Q64_Minimum_Path_Sum {

    public static void main(String[] args) {
        int[][] res = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        System.out.println(minPathSum(res));
    }

    public static int minPathSum(int[][] grid) {
        int m = grid.length;
        if (m == 0 || grid == null) return 0;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        //dp[i][j]  =  min{dp[i-1]+g[i][j],dp[i][j-1]}
        dp[0][0] = grid[0][0];
        for (int i = 1; i < n; i++) {
            dp[0][i] = dp[0][i - 1] + grid[0][i];
        }
        for (int i = 1; i < m; i++) {
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        }
        for (int i = 1; i < m; i++) { //行
            for (int j = 1; j < n; j++) { //列
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
            }
        }
        return dp[m - 1][n - 1];

    }
}
