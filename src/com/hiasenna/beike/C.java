package com.hiasenna.beike;

import java.util.Scanner;

/**
 * @ClassName C
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/11-19:46
 * @Version 1.0
 **/
public class C {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println(n^2);

    }
}
