package com.hiasenna;

/**
 * @ClassName Q647
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/19-10:21
 * @Version 1.0
 **/
public class Q647 {
    public int countSubstrings(String s) {
        int len = s.length();
        int count = 0;
        // dp[i][j] 表示字符串s在[i,j]区间的子串是否是一个回文串。
        boolean[][] dp = new boolean[len][len];
        for (int i = 0;i<len;i++){
            for (int j = 0;j<=i;j++){
                if (s.charAt(i)==s.charAt(j)){
                    if (i-j<2) {
                        dp[i][j] = true;
                    }else {
                        dp[i][j] = dp[i-1][j+1];
                    }
                    if (dp[i][j]){
                        count++;
                    }
                }else {
                    dp[i][j] = false;
                }
            }
        }
        return count;
    }
}
