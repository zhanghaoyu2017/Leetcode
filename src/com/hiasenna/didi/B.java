package com.hiasenna.didi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @ClassName B
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/21-19:40
 * @Version 1.0
 **/
public class B {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (n>=10 || n<1) return;
        long[][] res = new long[n][n];
        long[] dp = new long[(n*n)+1];
        Arrays.fill(dp,1);
        //先计算dp数组
        for(int i = 3;i<=n*n;i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        int nums = n * n;
        int top = 0;
        int bottom = n -1;
        int left = 0;
        int right = n-1 ;
        while (nums >= 1) {
            for (int i = left; i <=right; i++) {
                res[top][i] = dp[nums];
                nums--;
            }
            top++;
            for (int i = top; i <=bottom; i++) {
                res[i][right] = dp[nums];
                nums--;
            }
            right--;
            for (int i = right; i >=left; i--) {
                res[bottom][i] = dp[nums];
                nums--;
            }
            bottom--;
            for (int i = bottom; i >=top; i--) {
                res[i][left] = dp[nums];
                nums--;
            }
            left++;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(res[i][j]);
            }
        }
    }
}
