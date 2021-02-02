package com.hiasenna;

import java.util.Arrays;

/**
 * @ClassName Q62_Unique_Path
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/7/20-11:12
 * @Version 1.0
 **/
public class Q62_Unique_Path {


    public static void main(String[] args) {
        System.out.println(uniquePaths3(3,2));
    }
    public static int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        Arrays.fill(dp[0],1);
        //dp[i][j] = dp[i-1][j] || dp[i][j-1]
        for (int i = 1;i<m;i++){
            dp[i][0] = 1;
            for (int j = 1;j<n;j++){
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
    //动态规划优化(二维数组降为一维数组)
    public static int uniquePaths2(int m, int n) {
        int[] dp = new int[n];
        Arrays.fill(dp,1);
        //dp[i][j] = dp[i-1][j] || dp[i][j-1]
        for (int i = 1;i<m;i++){
            dp[0] = 1;
            for (int j = 1;j<n;j++){
                dp[j] = dp[j] + dp[j-1];
            }
        }
        return dp[n-1];
    }

    public static int uniquePaths3(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0;i<m;i++){
            for (int j = 0;j<n;j++){
                if(i==0 || j==0){
                    dp[i][j] = 1;
                }else{
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }

            }
        }
        return dp[m-1][n-1];
    }

}
