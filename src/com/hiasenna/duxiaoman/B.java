package com.hiasenna.duxiaoman;

import java.util.Scanner;

/**
 * @ClassName B
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/9/20-20:27
 * @Version 1.0
 **/
public class B {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int k = s.nextInt();
        for (int i = 0; i < k; i++) {
            int m = s.nextInt();
            int n = s.nextInt();
            String[][] arr = new String[m][n];
            //构建迷宫
            for (int j = 0; j < m; j++) {
                String tmp = s.next();
                for (int q = 0; q < n; q++) {
                    arr[j][q] = tmp.charAt(q)+"";
                }
            }
            int res = -1;
            System.out.println(res);
        }
    }
}
