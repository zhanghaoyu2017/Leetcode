package com.hiasenna;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Q350 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	public static int[] intersect(int[] nums1, int[] nums2) {
		 // 对两个数组进行排序。
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int len1 = nums1.length, len2 = nums2.length;
        int[] ans = new int[Math.min(len1, len2)];
        int index1 = 0, index2 = 0, index = 0;
     // 只要有一个数组遍历完就跳出循环。
        while (index1 < len1 && index2 < len2) {
            // 遍历两个数组，谁小就移动谁的指针，相等就记录并同时移动指针。
            if (nums1[index1] < nums2[index2]) {
                index1++;
            } else if (nums1[index1] > nums2[index2]) {
                index2++;
            } else {
                ans[index] = nums1[index1];
                index1++;
                index2++;
                index++;
            }
        }
        // 遍历完成返回重复元素长度的结果数组。
        return Arrays.copyOfRange(ans, 0, index);
    }
	
	public static int[] intersect2(int[] nums1, int[] nums2) {
		 // 将长度短的数组换到前面。
        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }
        // 创建 HashMap 记录 nums1 中每个元素出现的次数。
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num : nums1) {
            int count = map.getOrDefault(num, 0) + 1;
            map.put(num, count);
        }
        int[] ans = new int[nums1.length];
        int index = 0;
        // 遍历数组 nums2 中元素，在 HashMap 中个数大于 0 则记录。
        for (int num : nums2) {
            int count = map.getOrDefault(num, 0);
            if (count > 0) {
                ans[index++] = num;
                count--;
                if (count > 0) {
                    map.put(num, count);
                } else {
                    map.remove(num);
                }
            }
        }
        // 遍历完成返回重复元素长度的结果数组。
        return Arrays.copyOfRange(ans, 0, index);
    }
}
