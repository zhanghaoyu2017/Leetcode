package com.hiasenna.beike;

import java.util.Map;
import java.util.Scanner;

/**
 * @ClassName B
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/11-19:13
 * @Version 1.0
 **/
public class B {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int k = s.nextInt(); //测试组数
        while (k > 0) {
            int res = 0;
            long n = s.nextInt();//行
            long m = s.nextInt();//列
            if (n == 1 && m == 1) {
                System.out.println(1);
            } else if (n % 2 == 0 && m % 2 == 0) {
                //偶偶
                res = 2;
                System.out.println(res);
            } else if (n % 2 == 1 && m % 2 == 0) {
                //奇偶
                res = 2;
                System.out.println(res);
            } else if (n % 2 == 0 && m % 2 == 1) {
                //偶奇
                res = 2;
                System.out.println(res);
            } else {
                //奇奇
                long x = n * m;
                for (int i = 2; i <= x; i++) {
                    if (m % i == 0 || n% i ==0) {
                        res = i;
                        break;
                    }
                }
                System.out.println(res);
            }

            k--;
        }
    }
}
