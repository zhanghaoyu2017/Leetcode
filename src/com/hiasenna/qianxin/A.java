package com.hiasenna.qianxin;

import java.util.Scanner;

/**
 * @ClassName A
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/16-15:16
 * @Version 1.0
 **/
public class A {
    int count = 0;
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        int num_money = s.nextInt();
//        if (num_money == 0){
//            System.out.println(0);
//            return;
//        }
//        int[] dp = new int[num_money+1];
//        dp[0] = 1;
//        dp[1] = 1;
//        dp[2] = 2;
//        for (int i = 3;i<=num_money;i++){
//            dp[i] = dp[i-2]+dp[i-1];
//        }
//        System.out.println(dp[num_money]+1);
        CalulateMethodCount(6);
    }
    static int CalulateMethodCount (int num_money) {
        // write code here

        if (num_money == 0) return 0;
        int[] dp = new int[num_money+1];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for (int i = 4;i<=num_money;i++){
            dp[i] = dp[i-3]+dp[i-2]+dp[i-1];
        }
        System.out.println(dp[num_money]+1);
        return dp[num_money];
    }




}
