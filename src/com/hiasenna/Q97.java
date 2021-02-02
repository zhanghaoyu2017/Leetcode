package com.hiasenna;

public class Q97 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String s1 = "aabcc";
        String s2 = "dbbca";
        String s3 = "aadbbcbcac";
        System.out.println(isInterleave2(s1, s2, s3));
    }

    public static boolean isInterleave(String s1, String s2, String s3) {
        //s1:[0...i...n-1];
        //s2:[0...j...m-1];
        //s3:[0...i+j...n+m-1];
        //dp[i][j] = s1[i->n-1]+s2[j->m-1] => s3[i+j->n+m-1]
        //boolean
        //状态转移方程：
        //1.s1[i] = s2[j]
        //1) s1[i] = s3[i+j]
        //dp[i][j] =  dp[i+1][j] || dp[i][j+1]
        //2) s1[i] = s3[i+j]
        //dp[i][j] = false
        //2.s1[i] != s2[j]
        //1) s1[i] = s3[i+j]
        //dp[i][j]  =  dp[i+1][j]
        //2) s2[j] = s3[i+j]
        //dp[i][j] = dp[i][j+1]
        //3) s1[i] != s2[j] != s3[i+j]
        //dp[i][j] = false
        //边界条件
        //dp[n][m] = true;
        //dp[n][j] = s2[j-> m-1] ==s3[n+j -> n+m-1] 0<=j<=m-1
        //dp[i][m] = s1[i-> n-1] ==s3[i+m -> n+m-1] 0<=i<=n-1
        int n = s1.length();
        int m = s2.length();
        if (n + m != s3.length()) {
            return false;
        }
        boolean[][] prev = new boolean[n + 1][m + 1];
        for (int i = n; i >= 0; i--) {
            boolean[][] dp = new boolean[n + 1][m + 1];
             for (int j = m; j >= 0; j--) {
                if (i == n && j == m) {
                    dp[i][j] = true;
                } else if (i == n) {
                    dp[i][j] = s2.substring(j).equals(s3.substring(i + j));
                } else if (j == m) {
                    dp[i][j] = s1.substring(i).equals(s3.substring(i + j));
                } else {
                    char a = s1.charAt(i);
                    char b = s2.charAt(j);
                    char c = s3.charAt(i + j);
                    if (a == b) {
                        if (a == c) {
                            dp[i][j] = prev[i][j] || dp[i][j + 1];
                        }
                    } else {
                        if (a == c) {
                            dp[i][j] = prev[i][j];
                        } else if (b == c) {
                            dp[i][j] = prev[i][j + 1];
                        }
                    }
                }
            }
            prev = dp;
        }
        return prev[0][0];
    }

    public static boolean isInterleave2(String s1, String s2, String s3) {

        int len1 = s1.length(), len2 = s2.length(), len3 = s3.length();
        // 如果字符串长度不同则一定为false
        if (len1 + len2 != len3) return false;
        boolean[][] dp = new boolean[len1 + 1][len2 + 2];
        // 初始状态
        dp[0][0] = true;
        // 初始化dp数组的第一行与第一列
        for (int i = 1; i <= len1; i++) {
            if (s1.charAt(i - 1) == s3.charAt(i - 1)) dp[i][0] = true;
            else break;
        }
        for (int i = 1; i <= len2; i++) {
            if (s2.charAt(i - 1) == s3.charAt(i - 1)) dp[0][i] = true;
            else break;
        }
        for (int i = 1; i <= len1; i++) {
            for (int j = 1; j <= len2; j++) {
                int sum = i + j;   // sum为当前定位到的s3字符串的索引
                // 判断dp[i-1][j]或dp[i][j-1]是否true
                if (dp[i - 1][j] || dp[i][j - 1])
                	dp[i][j] = (dp[i - 1][j] && s1.charAt(i - 1) == s3.charAt(sum - 1)) ||
							(dp[i][j - 1] && s2.charAt(j - 1) == s3.charAt(sum - 1));
            }
        }
        return dp[len1][len2];
        // 输出 DP 数组
        // for (int i = 0; i <= len1; i++) {
        //     for (int j = 0; j <= len2; j++) {
        //         System.out.print(dp[i][j] + " ");
        //     }
        //     System.out.println();
        // }

    }


}
