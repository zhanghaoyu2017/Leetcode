package com.hiasenna;

/**
 * @ClassName Q53_Maximum_Subarray
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/7/21-17:46
 * @Version 1.0
 **/
public class Q53_Maximum_Subarray {
    public static void main(String[] args) {
        int[] res = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(res));
    }
    public static int maxSubArray(int[] nums) {
        int n = nums.length;
        if (n==0||nums == null){
            return 0;
        }
        int[] dp = new int[n];
        dp[0] = nums[0];
        int max = dp[0];
        for (int i =1;i<n;i++){
            dp[i] = Math.max(dp[i-1]+nums[i],nums[i]);
            max = Math.max(dp[i],max);
        }
        return max;
    }
}
