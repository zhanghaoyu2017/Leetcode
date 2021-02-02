package com.hiasenna;

import java.util.Arrays;

/**
 * @ClassName Q673_Number_of_Longest_Increasing_Subsequence最长递增子序列的个数
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/7/22-10:47
 * @Version 1.0
 **/
public class Q673_Number_of_Longest_Increasing_Subsequence {
    public static void main(String[] args) {
        int[] res = {1, 3, 5, 4, 7};
        System.out.println(findNumberOfLIS(res));
    }

    public static int findNumberOfLIS(int[] nums) {
        int n = nums.length;
        if (n == 0 || nums == null) {
            return 0;
        }
        int[] dp = new int[n];
        int[] counter = new int[n];
        Arrays.fill(counter, 1);
        Arrays.fill(dp,1);
        int max = 1;
        dp[0] = 1;
        //dp[i]  数组到i存在的最长子序列长度
        //dp[i] = dp[i-1] +1  nums[i] > nums[i-1]
        //dp[i] = dp[i-1]
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    if (dp[j] + 1 > dp[i]) {
                        dp[i] = Math.max(dp[j] + 1, dp[i]);
                        counter[i] = counter[j];
                    } else if (dp[j] + 1 == dp[i]) {
                        counter[i] += counter[j];
                    }
                }
            }
            max = Math.max(max, dp[i]);
        }
        int count = 0;

        for (int i = 0; i < dp.length; i++) {
            if (dp[i] == max) {
                count += counter[i];
            }
        }
        return count;
    }
}
