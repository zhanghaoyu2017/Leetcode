package com.hiasenna;

import java.util.Arrays;

/**
 * @ClassName Q88合并两个有序数组
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/7/28-11:04
 * @Version 1.0
 **/
public class Q88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = 0;
        for (int i =m;i<n+m;i++){
            nums1[i] = nums2[index];
            index++;
        }
        Arrays.sort(nums1);
    }

    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        // 三指针 指针一p1、nums1有效元素尾部；指针二p2、nums2尾部；指针三p3、最终数组尾部
        // 1.当，p1>=0时，nums[p1],nums[p2]对比
        // 1.1 nums[p1]大，将nums[p1]放入p3位置。p1--,p3--
        // 1.2 nums[p2]大于等于nums[p1]，将nums[p2]放入p3位置。p2--,p3--
        // 2.当，p1<0时，将nums[p2]放入p3位置。p2--,p3--
        // 循环结束条件：p2<0

        int p1=m-1,p2=n-1,p3=m+n-1;
        while(p2 >= 0){
            if(p1 >= 0 && nums1[p1] > nums2[p2]){
                nums1[p3--] = nums1[p1--];
            } else {
                nums1[p3--] = nums2[p2--];
            }
        }
    }
}
