package com.hiasenna;

/**
 * @ClassName Q63_Unique_PathII
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/7/20-17:32
 * @Version 1.0
 **/
public class Q63_Unique_PathII {
    public static void main(String[] args) {

    }

    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        //dp[i][j] = dp[i-1][j]+dp[i][j-1]
        if (obstacleGrid == null || obstacleGrid.length == 0) {
            return 0;
        }
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];


        for (int j = 0;j<m && obstacleGrid[j][0]==0;j++){
            dp[j][0]=1;
        }
        for (int i = 0;i<n && obstacleGrid[0][i]==0;i++){
            dp[0][i]=1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (obstacleGrid[i][j] == 0) {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }

            }
        }
        return dp[m - 1][n - 1];
    }
}
