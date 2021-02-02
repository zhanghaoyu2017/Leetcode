package com.hiasenna;

/**
 * @ClassName Q287
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/9/16-16:41
 * @Version 1.0
 **/
public class Q287 {
    public int findDuplicate(int[] nums) {
        int slow = 0;
        int fast = 0;
        slow = nums[slow];
        fast = nums[nums[fast]];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        slow = 0;
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}
