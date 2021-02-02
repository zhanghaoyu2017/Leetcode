package com.hiasenna.offer;

/**
 * @ClassName O53
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/7/25-16:43
 * @Version 1.0
 **/
public class O53 {
    public int missingNumber(int[] nums) {
        int lo = 0;
        int hi = nums.length;
        while (lo<hi){
            int mid = (lo + hi) / 2;
            if (nums[mid] != mid+1) return mid;
            if (nums[mid] > mid) hi = mid;
            else lo = mid+1;
        }
        return lo;
    }

    public int search(int[] nums, int target) {
        return helper(nums, target) - helper(nums, target - 1);
    }
    public int helper(int[] nums, int tar) {
        int lo = 0;
        int hi = nums.length;
        while (lo < hi){
            int mid = (lo+hi)/2;
            if (nums[mid] <= tar) lo = mid+1;
            else hi = mid;
        }
        return lo;
    }
}
