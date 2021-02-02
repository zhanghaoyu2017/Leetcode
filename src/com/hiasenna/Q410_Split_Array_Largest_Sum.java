package com.hiasenna;

import java.util.Arrays;

/**
 * @ClassName Q410_Split_Array_Largest_Sum
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/7/25-10:24
 * @Version 1.0
 **/
public class Q410_Split_Array_Largest_Sum {
    //时刻牢记：我们要求的是m个子数组各自和的最大值的最小值，这里我们用res来表示
    public int splitArray(int[] nums, int m) {
        int max = 0; //每个数都分成一个 max就是最大值
        int sum = 0; //将数组就分为一份  sum 就是最大值
        for (int num : nums) {
            max = Math.max(max, num);
            sum += num;
        }
        //lo=子数组和最小值（每个元素为一个子数组），hi=子数组和的最大值（当前整个数组，不分割）
        //res肯定是在lo到hi之间
        //现在就是怎么找到这个值
        //自然想到二分来查找这个值，在什么情况下往左移，什么情况往右移呢？
        //通过判断当res=mid时，该数组是被分割成几个部分，
        //如果大于m，则表示分割的太多了，mid的值偏小了，往右半部分走
        //如果小于m，则表示分割的太少了，mid的值偏大了，往左半部分走
        //当lo=hi时，则找到最终的结果res
        int lo = max;
        int hi = sum;
        while (lo < hi) {
            int mid = (hi - lo) / 2 + lo;
            int pieces = split(nums, mid);
            if (pieces > m) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return lo;

    }

    //对假定的子数组各自和的最大值中的最小值res（largestNum）计算出应该分割成几个子数组
    private int split(int[] nums, int largestNum) {
        int pieces = 1;
        int tmpSum = 0;
        for (int num : nums) {
            if (tmpSum + num > largestNum) {
                //分割  出现新的数组
                tmpSum = num;
                pieces++;
            } else {
                tmpSum += num;
            }
        }
        return pieces;
    }

    public int splitArray2(int[] nums, int m) {
        int max = 0;
        int sum = 0;
        for (int num : nums) {
            max = Math.max(max, num);
            sum += num;

        }
        int lo = max;
        int hi = sum;
        for (int i = 0; i < nums.length; i++) {
            int mid = (hi - lo) / 2 + lo;
            int pieces = split2(nums, mid);
            if (pieces > m) {
                //分割多了  需要少分一些 mid值小了
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return lo;

    }

    private int split2(int[] nums, int largestNum) {
        int pieces = 1;
        int tempSum = 0;
        for (int num : nums) {
            if (num + tempSum > largestNum) {
                //分割
                tempSum = num;
                pieces++;
            } else {
                tempSum += num;
            }
        }
        return pieces;


    }



}
