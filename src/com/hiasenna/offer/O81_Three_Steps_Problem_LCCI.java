package com.hiasenna.offer;

/**
 * @ClassName O81_Three_Steps_Problem_LCCI
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/7/21-17:01
 * @Version 1.0
 **/
public class O81_Three_Steps_Problem_LCCI {
    public static void main(String[] args) {
        System.out.println(waysToStep(5));
    }

    public static int waysToStep(int n) {
        //dp[0] = 0
        //dp[1] = 1
        //dp[2] = 2
        //dp[3] = 4
        //dp[4] = 7
        //dp[5] = 13
        //dp[i] = dp[i-3]+dp[i-2]+dp[i-1]
        if (n==0 || n==1 || n==2){
            return n;
        }
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for (int i = 4;i<=n;i++){
            dp[i] = dp[i-3]+(dp[i-2]+dp[i-1])%1000000007;
            dp[i] %= 1000000007;
        }
        return dp[n];

    }
}
