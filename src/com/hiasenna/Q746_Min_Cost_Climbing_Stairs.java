package com.hiasenna;

/**
 * @ClassName Q746_Min_Cost_Climbing_Stairs
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/7/21-17:24
 * @Version 1.0
 **/
public class Q746_Min_Cost_Climbing_Stairs {
    public static void main(String[] args) {
        int[] res = {10,15,20};
        System.out.println(minCostClimbingStairs(res));
    }
    public static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        if (cost == null || n == 0){
            return  0;
        }
        int[] dp = new int[n];
        dp[0] = 0;//直接跨过去
        dp[1] = Math.min(cost[0],cost[1]);
        for (int i =2;i<n;i++){
            dp[i] = Math.min(dp[i-2]+cost[i-1],dp[i-1]+cost[i]);
        }
        return dp[n-1];
    }
}
