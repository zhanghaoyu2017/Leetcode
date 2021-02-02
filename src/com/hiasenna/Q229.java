package com.hiasenna;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Q229
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/10-11:44
 * @Version 1.0
 **/
public class Q229 {
    public List<Integer> majorityElement(int[] nums) {
        // 创建返回值
        List<Integer> res = new ArrayList<>();
        if (nums == null || nums.length == 0) return res;
        // 初始化两个候选人candidate，和他们的计票
        int people1 = nums[0];
        int count1 = 0;
        int people2 = nums[0];
        int count2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == people1) {
                count1++;
                continue;
            }
            if (nums[i] == people2) {
                count2++;
                continue;
            }
            if (count1 == 0) {
                people1 = nums[i];
                count1 = 1;
                continue;
            }
            if (count2 == 0) {
                people2 = nums[i];
                count2 = 1;
                continue;
            }
            count1--;
            count2--;
        }
        count1 = 0;
        count2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == people1) count1++;
            else if (nums[i] == people2) count2++;
        }
        if (count1 > nums.length / 3) res.add(people1);
        if (count2 > nums.length / 3) res.add(people2);
        return res;
    }
}
