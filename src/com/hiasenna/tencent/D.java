package com.hiasenna.tencent;

import java.util.Scanner;

/**
 * @ClassName D
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/23-21:12
 * @Version 1.0
 **/
public class D {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (n==1){
            System.out.println(1);
            return;
        }
        int[] arr = new int[n];
        int[] dp = new int[n];
        for (int i = 0;i<n;i++){
            arr[i] = s.nextInt();
        }
        dp[0] = 1;
        int max = 1;
        for (int i =1;i<n;i++){
             max = Math.max(max,arr[i]);
            if (arr[i] == arr[i-1]){
                dp[i] = dp[i-1]+1;
            }else if (arr[i] < max){
                dp[i] = dp[i-1];
            } else {
                dp[i] = dp[i-1]+1;
            }

        }
        System.out.println(dp[n-1]);

    }
}
