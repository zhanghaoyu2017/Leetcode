package com.hiasenna.tencent;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @ClassName A
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/23-20:00
 * @Version 1.0
 **/
public class A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
//        List<Integer> list = new ArrayList<>();
//        int[] arr = new int[n];
        int index = 1;
        for (int i = 0; i < n; i++) {
            int a = s.nextInt();
            if (index != k) {
                System.out.print(a);
                System.out.print(" ");
            }
            index++;
        }
    }
}
