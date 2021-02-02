package com.hiasenna;

/**
 * @ClassName Q213_house_robberII
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/7/26-9:11
 * @Version 1.0
 **/
public class Q213_house_robberII {


    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 0 || nums == null) return 0;
        int[] dp0 = new int[n];//偷第一家
        int[] dp1 = new int[n];//不偷第一家
        if (n == 1) return nums[0];
        if (n == 2) return Math.max(nums[0], nums[1]);
        dp0[0] = nums[0];
        dp0[1] = dp0[0];
        dp1[1] = nums[1];
        dp1[2] = dp1[1];
        for (int i = 2; i < n; i++) {
            if (i != n - 1) {
                dp0[i] = Math.max(dp0[i - 2] + nums[i], dp0[i - 1]);
                dp1[i] = Math.max(dp1[i - 2] + nums[i], dp1[i - 1]);

            }else {
                //偷最后一家
                dp0[i] = dp0[i-1];
                dp1[i] = Math.max(dp1[i - 2] + nums[i], dp1[i - 1]);
            }
        }

        return Math.max(dp0[n - 1], dp1[n - 1]);
    }
}
