package com.hiasenna;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 215. 数组中的第K个最大元素
 * @author zhanghaoyu
 *
 */
public class Q215 {
	
	public static void main(String[] args) {
		int nums[] = {3,2,1,5,6,4};
		int result = findKthLargest(nums, 2);
		System.out.println(result);
	}
//	 public static int findKthLargest(int[] nums, int k) {
//		int len = nums.length;
//		Arrays.sort(nums);
//		// 从后往前遍历升序数组，直到找到第 k 个最大的元素。
//        for (int i = len - 1; i >= 0; i--) {
//            k--;
//            if (k == 0) {
//                return nums[i];
//            }
//        }
//        return nums[len - 1];
//	}
    public static int findKthLargest(int[] nums, int k) {
        k = nums.length - k;//注意这里的k已经变了
        int l = 0, h = nums.length - 1;
        while (l <= h) {
            int i = l;
            //这里把数组以A[lo]的大小分为两部分，
            //一部分是小于A[lo]的，一部分是大于A[lo]的
            // [lo,i]<A[lo]，[i+1,j)>=A[lo]
            for (int j = l + 1; j <= h; j++)
                if (nums[j] < nums[l])
                    swap(nums, j, ++i);
            swap(nums, l, i);
            if (k == i)
                return nums[i];
            else if (k < i)
                h = i - 1;
            else
                l = i + 1;
        }
        return -1;
    }

    private static void swap(int[] nums, int i, int j) {
        if (i != j) {
            nums[i] ^= nums[j];
            nums[j] ^= nums[i];
            nums[i] ^= nums[j];
        }
    }

}
