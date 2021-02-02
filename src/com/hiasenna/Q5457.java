package com.hiasenna;

/**
 * @ClassName Q5457
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/7/26-0:50
 * @Version 1.0
 **/
public class Q5457 {
//    dp[i][0] 记录以arr[i]结尾的奇数数量
//    dp[i][1] 记录以arr[i]结尾的偶数数量
    public int numOfSubarrays(int[] arr) {
        int n = arr.length;
        int res = 0;
        int[][] dp = new int[n][2];
        if (arr[0] % 2 ==1) dp[0][0] = 1;
        else dp[0][1] =1;
        for (int i =1;i<n;i++){
            if (arr[i] %2==0){
                dp[i][0] = dp[i-1][0];
                dp[i][1] = dp[i-1][1]+1;
            }else {
                dp[i][0] = dp[i-1][1]+1;
                dp[i][1] = dp[i-1][0];
            }

        }
        for (int i =0;i<n;i++){
            res += dp[i][0] % 1000000007;
        }
        return res;
    }
}
