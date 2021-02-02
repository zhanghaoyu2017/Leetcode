package com.hiasenna.tencent;

import java.util.Scanner;

/**
 * @ClassName C
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/23-20:34
 * @Version 1.0
 **/
public class C {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int i = 0; i <t; i++) {
            int max = 0;
            int p = s.nextInt();
            int r =p;
            if (p<10) {
                System.out.println(p);
                return;
            }
            for (int j = 0; j <= p / 2; j++) {
                int num1 = j;
                int num2 = r;
                int res = 0;
                while (num1 != 0 || num2 != 0) {
                    res += num1 % 10;
                    res += num2 % 10;
                    num1 /= 10;
                    num2 /= 10;
                }
                System.out.println(j+"=="+r);
                System.out.println(res);
                max = Math.max(max,res);
                r--;
            }
            System.out.println(max);
        }

    }

}

