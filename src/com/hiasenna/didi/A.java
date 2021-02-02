package com.hiasenna.didi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @ClassName A
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/21-19:30
 * @Version 1.0
 **/
public class A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int n = s.nextInt();
        for (int a = 1; a <= 9; a++) {
            for (int b = 0; b <= 9; b++) {
                for (int c = 0; c <= 9; c++) {
                    int num1 = a * 100 + b * 10 + c;
                    int num2 = a * 100 + c * 10 + c;
                    if (num1 + num2 == n && a != b && a != c && b != c) {
                        list.add(num1);
                        list.add(num2);
                    }
                }
            }
        }
        if (!list.isEmpty()) {
            System.out.println(list.size() / 2);
            for (int i = 1; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
        } else {
            System.out.println(0);
        }
    }
}
