package com.hiasenna.jingdong;

import java.util.Scanner;

/**
 * @ClassName A
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/6-19:25
 * @Version 1.0
 **/
public class A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (n > 0) {
            double res;
            String ans;
            double z = 0.0;
            double f = 0.0;
            for (int i = 0; i < n; i++) {
                z += 1.0 / (i * 10 + 5);
            }
            for (int i = 0; i < n; i++) {
                f += 1.0 / (i * 10 + 10);
            }
            res = z - f;
            ans = String.valueOf((Math.round(res * 10000))/10000.0);
            if (ans.length() < 6) {
                //补0
                for (int i = ans.length(); i < 6; i++) {
                    ans += 0;
                }
            }
            System.out.println(ans);
        } else if (n==0) {
            System.out.println("-0.1000");
        } else {
            int k = -n;
            double res;
            String ans;
            double z = 0.0;
            double f = 0.0;
            for (int i = 0; i < k; i++) {
                z += 1.0 / (i * 10 + 20);
            }
            for (int i = 0; i < k; i++) {
                f += 1.0 / (i * 10 + 10);
            }
            res = f - z;
            ans = String.valueOf((Math.round(res * 10000)) / 10000.0);
            if (ans.length() < 6) {
                //补0
                for (int i = ans.length(); i < 6; i++) {
                    ans += 0;
                }
            }
            System.out.println(ans);
        }

    }
}
