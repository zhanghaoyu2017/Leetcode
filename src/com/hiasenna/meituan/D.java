package com.hiasenna.meituan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @ClassName D
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/8-16:49
 * @Version 1.0
 **/
public class D {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        List<Integer> list = new ArrayList<>();
        int res = 0;
        for (int i = 0; i < n; i++) {
            int a = s.nextInt();
            list.add(a);
        }
        while (list.size() > 0) {
            boolean flag = false;
            for (int i = list.size() - 1; i > 0; i--) {
                int num1 = list.get(i);
                int num2 = list.get(i - 1);
                if (num1 == num2) {
                    flag = true;
                    list.remove(i);
                    list.add(i , num1 + 1);
                    list.remove(i - 1);
                    res++;
                }
            }


            if (!flag) break;
            else flag = false;
        }

        System.out.println(res);

    }
}
