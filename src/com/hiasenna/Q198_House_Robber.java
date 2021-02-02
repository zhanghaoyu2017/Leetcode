package com.hiasenna;

/**
 * @ClassName Q198_House_Robber
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/7/21-11:55
 * @Version 1.0
 **/
public class Q198_House_Robber {
    public static void main(String[] args) {
        int[] arr = {2,1,1,2};
        System.out.println(rob(arr));
    }
    public static int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
      int n = nums.length;
//        dp[0]=nums[0]  只有一间房屋，则偷窃该房屋
//        dp[1]=max(nums[0],nums[1])  只有两间房屋，选择其中金额较高的房屋进行偷窃
//        dp[i]=max(dp[i−2]+nums[i],dp[i−1])
        if (n ==1){
            return nums[0];
        }
        int[] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
        for (int i =2;i<n;i++){
            dp[i] = Math.max(dp[i-1],dp[i-2]+nums[i]);
        }
        return dp[n-1];
    }
    public static int rob2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int n = nums.length;
        if (n==1){
            return nums[0];
        }
        int first = nums[0];
        int second = Math.max(nums[0],nums[1]);
        for (int i =2;i<n;i++){
            int temp =second;
            second = Math.max(second,first+nums[i]);
            first = temp;
        }
        return second;
    }
}
