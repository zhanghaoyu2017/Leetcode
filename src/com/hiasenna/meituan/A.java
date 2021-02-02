package com.hiasenna.meituan;

import java.util.Scanner;

/**
 * @ClassName A
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/8-16:04
 * @Version 1.0
 **/
public class A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int one = s.nextInt();
        int two = s.nextInt();
        int three = s.nextInt();
        int four = s.nextInt();
        int five = s.nextInt();
        int count = one+two+three+four+five;
        double res = Math.floor(((one+two*2+three*3+four*4+five*5)/(count*1.0))*10)/10.0;
        System.out.println(res);

    }
}
