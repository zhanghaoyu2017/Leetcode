package com.hiasenna.offer;

/**
 * @ClassName O66
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/7/27-17:28
 * @Version 1.0
 **/
public class O66 {
    public int[] constructArr(int[] a) {
        int n = a.length;
        if (n==0||a == null) return a;
        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = 1;
        right[n-1] = 1;
        for (int i = 1;i<n;i++){
            left[i] = left[i-1]*a[i-1];
        }
        for (int i = n-2;i>=0;i--){
            right[i] = right[i+1]*a[i+1];
        }

        int[] res  = new int[n];
        for (int i =0;i<n;i++){
            res[i] = left[i]*right[i];
        }
        return res;
    }
}

