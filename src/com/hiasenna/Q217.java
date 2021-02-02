package com.hiasenna;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName Q217
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/1-11:42
 * @Version 1.0
 **/
public class Q217 {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        for (int i = 0;i<n;i++){
            if (set.contains(nums[i])) return true;
            else {
                set.add(nums[i]);
            }
        }
        return false;
    }
}
