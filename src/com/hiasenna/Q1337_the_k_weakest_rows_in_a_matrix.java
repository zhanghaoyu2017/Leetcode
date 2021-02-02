package com.hiasenna;

import java.util.Arrays;

/**
 * @ClassName Q1337_the_k_weakest_rows_in_a_matrix
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/7/25-17:39
 * @Version 1.0
 **/
public class Q1337_the_k_weakest_rows_in_a_matrix {
    public static void main(String[] args) {
        int[][] mat = {{1, 1, 0, 0, 0},
                {1, 1, 1, 1, 0},
                {1, 0, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 1}};
        System.out.println(kWeakestRows(mat, 3));
    }

    public static int[] kWeakestRows(int[][] mat, int k) {
        int[][] tmp = new int[mat.length][2];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                tmp[i][0] = i;
                if (mat[i][j] == 1) tmp[i][1]++;
            }
        }
        Arrays.sort(tmp, (o1, o2) -> o1[1] - o2[1]);
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = tmp[i][0];
        }
        return res;

    }

    public int maxSubArray(int[] nums) {
        int n = nums.length;
        if (n == 0 || nums == null) return 0;
        int[] dp = new int[n];
        dp[0] = nums[0];
        int max = nums[0];
        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(dp[i-1]+nums[i],nums[i]);
            max =Math.max(max,dp[i]);
        }
        return max;
    }
}
