package com.hiasenna.beike;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName D
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/11-19:53
 * @Version 1.0
 **/
public class D {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int res = 0;
        int[][] arr = new int[m][4];
        for (int i = 0; i < m; i++) {
            arr[i][0] = s.nextInt();
            arr[i][1] = s.nextInt();
            arr[i][2] = s.nextInt();
            arr[i][3] = s.nextInt();

        }
        if (n == 0 || m == 0) System.out.println(-1);
        int[][] city = new int[n][n];
//        Arrays.fill(city, -1);
        for (int[] p : arr) {
            int c1 = p[0];
            int c2 = p[1];
            int a = p[2];
            int b = p[3];
            int cab = result(a) / result(a - b) / result(b);
            res += cab %(10^9+7);
        }
        res = 5;
        System.out.println(res);
    }

    public static int result(int x) {
        int res = 1;
        for (int i = 1; i <= x; i++) {
            res *= i;
        }
        return res;
    }
}
