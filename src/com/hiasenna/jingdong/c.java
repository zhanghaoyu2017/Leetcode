package com.hiasenna.jingdong;


/**
 * @ClassName c
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/6-20:40
 * @Version 1.0
 **/
public class c {
    public static void main(String[] args) {
        double a = 1.0 / 5 + 1.0 / 15 + 1.0 / 25 + 1.0 / 35 + 1.0 / 45;
        double b = 1.0 / 10 + 1.0 / 20 + 1.0 / 30 + 1.0 / 40 + 1.0 / 50;
//        System.out.println(a-b);
        System.out.println(Math.round(0.1 * 10000) / 10000.0);
    }

    public static void quickSort(int left, int right, int[] arr) {
        if (left > right) return;
        int i = left;
        int j = right;
        int temp = arr[left];
        int t;
        while (i < j) {
            while (j > i && arr[j] > temp) j--;
            while (i < j && arr[i] < temp) i++;
            if (i < j) {
                t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }
        }
        arr[left] = arr[i];
        arr[i] = temp;

        quickSort(left, i - 1, arr);
        quickSort(j + 1, right, arr);
    }

}
