package com.hiasenna.xunfei;

import java.util.Scanner;

/**
 * @ClassName A
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/7/31-14:01
 * @Version 1.0
 **/
public class A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int one = 0;
        int five = 0;
        int ten = 0;
        int fifty = 0;
        int hundred = 0;
        int k = 0;//支付k元
        int res = 0;//需要多少張
        one = in.nextInt();
        five = in.nextInt();
        ten = in.nextInt();
        fifty = in.nextInt();
        hundred = in.nextInt();
        k = in.nextInt();
        while (k > 0) {
            if (k - 100 >= 0 && hundred > 0) {
                hundred -= 1;
                k -= 100;
                res += 1;
            } else if (k - 50 >= 0 && fifty > 0) {
                fifty -= 1;
                k -= 50;
                res += 1;
            } else if (k - 10 >= 0 && ten > 0) {
                ten -= 1;
                k -= 10;
                res += 1;
            } else if (k - 5 >= 0 && five > 0) {
                five -= 1;
                k -= 5;
                res += 1;
            } else if (k - 1 >= 0 && one > 0) {
                one -= 1;
                k -= 1;
                res += 1;
            }else {
                res = -1;
                break;
            }
        }
        System.out.println(res);


    }
}
