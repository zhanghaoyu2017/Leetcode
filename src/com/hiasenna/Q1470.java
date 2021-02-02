package com.hiasenna;

/**
 * @ClassName Q1470
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/5-9:37
 * @Version 1.0
 **/
public class Q1470 {
    public static void main(String[] args) {
        int[] a = {2, 5, 1, 3, 4, 7};
        int[] res = shuffle(a, 3);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }

    public static int[] shuffle(int[] nums, int n) {
        if (n == 1) return nums;
        int[] res = new int[2 * n];
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = nums[i];
        }
        for (int i = 0; i < n; i++) {
            y[i] = nums[i + n];
        }
        int xidx = 0;
        int yidx = 0;
        for (int i = 0; i < 2 * n; i++) {
            if (i % 2 == 0) {
                res[i] = x[xidx];
                xidx++;
            } else if (i % 2 == 1) {
                res[i] = y[yidx];
                yidx++;
            }
        }
        return res;

    }

    public int[] shuffle2(int[] nums, int n) {
        int index = 0;
        int[] result = new int[nums.length];
        for (int i = 0; i < n; i++) {
            result[index++] = nums[i];
            result[index++] = nums[n+i];
        }
        return result;
    }

}
