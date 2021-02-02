package com.hiasenna;

/**
 * @ClassName Q152_Maximum_Product_Subarray
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/7/20-16:38
 * @Version 1.0
 **/
public class Q152_Maximum_Product_Subarray {
    public static void main(String[] args) {
        int[] nums ={2,3,-2,4};
        System.out.println(maxProduct(nums));
    }
    public static int maxProduct(int[] nums) {
        int n = nums.length;
        if (n<2){
            return nums[0];
        }
        int[] dp = new int[n];
        for (int i = 0;i<n;i++){
            int max = nums[i];
            int temp = nums[i];
            for (int j = i+1;j<n;j++){
                max = max * nums[j];
                if (max>temp) temp = max;
            }
            dp[i] = temp;
        }
        int res = 0;
        for (int i = 0;i<n;i++){
            if (dp[i] > res) res = dp[i];
        }
        return res;
    }
}
