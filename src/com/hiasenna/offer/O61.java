package com.hiasenna.offer;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName O61
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/7/26-17:10
 * @Version 1.0
 **/
public class O61 {
    public static void main(String[] args) {
        int[] arr = {0,0,3,4,5};
        System.out.println(isStraight(arr));
    }
    public static boolean isStraight(int[] nums) {
        Arrays.sort(nums);
        Set<Integer> check = new HashSet<>();
        int min = nums[4];
        int max = nums[4];
        for (int i = 0;i<nums.length;i++){
            if (nums[i] == 0) continue;
            if (check.contains(nums[i])) return false;
            min = Math.min(min,nums[i]);
            max = Math.max(max,nums[i]);
            check.add(nums[i]);
        }
        return max - min < 5;
    }
}
