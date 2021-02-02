package com.hiasenna;

import java.util.Arrays;

/**
 * @ClassName Q300
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/9-15:27
 * @Version 1.0
 **/
public class Q300 {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        if (n==0 || nums == null) return 0;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        int max =1;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++){
                if (nums[j]<nums[i])
                    dp[i] = Math.max(dp[i],dp[j]+1);
            }
            max = Math.max(max,dp[i]);
        }
        return max;

    }
}
