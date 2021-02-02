package com.hiasenna.offer;

/**
 * @ClassName O42_LCOF
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/7/21-16:00
 * @Version 1.0
 **/
public class O42_LCOF {
    public static void main(String[] args) {

    }

    public static int maxSubArray(int[] nums) {
        //dp[0] = nums[0]
        //dp[1] =
        int n = nums.length;
        int[] dp = new int[n];


        dp[0] = nums[0];
        int max = dp[0];
        for (int i =1;i<n;i++){
            dp[i] = Math.max(dp[i-1]+nums[i],nums[i]);
            max = Math.max(dp[i],max);
        }
        return max;
    }

    public static int massage(int[] nums) {
        if (nums == null || nums.length == 0){
            return 0;
        }
        int  n = nums.length;
        if (n==1){
            return nums[0];
        }
        int[] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
        for (int i =2;i<n;i++){
            dp[i] = Math.max(dp[i-2]+nums[i],dp[i-1]);
        }
        return dp[n-1];
    }
}
