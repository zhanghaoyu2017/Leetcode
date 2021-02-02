package com.hiasenna.meituan;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

/**
 * @ClassName B
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/8-16:18
 * @Version 1.0
 **/
public class B {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (n==0){
            System.out.println(0+" "+0);
            return;
        }
        int[] pice = new int[n * 2];
        int money = 0;
        int realMoney = 0;
        for (int i = 0; i < n*2; i += 2) {
            int price = s.nextInt();
            int del = s.nextInt();
            pice[i] = price;
            pice[i + 1] = del;
        }
        for (int i =0;i<pice.length;i+=2){
            int x = pice[i];
            int y = pice[i+1];
            if (x > y){
                //满减
                money += x;
                realMoney += x-y;
            }else{
                money += y;
            }
        }
        System.out.println(money+" "+realMoney);
    }
}
