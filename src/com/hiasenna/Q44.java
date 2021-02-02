package com.hiasenna;

public class Q44 {

	public static void main(String[] args) {
		String s = "adceb";
		String p = "*a*b";
		System.out.println(isMatch(s, p));
	}

	public static boolean isMatch(String s, String p) {	
		int m = s.length();
		int n = p.length();
		boolean[][] dp = new boolean[m + 1][n + 1];
		dp[0][0] = true;
		for (int i = 1; i <= n; i++) {
			// 处理 p以*开头的情况
			if (p.charAt(i - 1) == '*') {
				dp[0][i] = true;
			} else {
				break;	
			}
		}
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				if (p.charAt(j - 1) == '*') {
					dp[i][j] = dp[i][j - 1] || dp[i - 1][j];
				} else if (p.charAt(j - 1) == '?' || s.charAt(i - 1) == p.charAt(j - 1)) {
					dp[i][j] = dp[i - 1][j - 1];
				}

			}
		}
		return dp[m][n];

	}

	public static boolean isMatch2(String s, String p) {
		// s [0 .. i .. n-1]
		// p [0 .. j .. m-1]
		// dp[i][j] : isMatch(s[i->n-1],p[j->m-1])
		// 1. s[i] = p[j]
		// dp[i][j] = dp[i+1][j+1]
		// 2. s[i] != p[j]
		// 1) p[j] = '?'
		// dp[i][j] = dp[i+1][j+1]
		// 2) p[j] = '*'
		// dp[i][j] = dp[i][j+1] || dp[i+1][j]
		// 3) p[j] = other
		// dp[i][j] = false
		// dp[n][m] = true
		// dp[i][n] = false 0<= i <= n-1
		// dp[n][j] = p[j] == '*' && dp[n][j+1] 0<=j <= m-1
		int n = s.length();
		int m = p.length();
		boolean[] prev = new boolean[m + 1];
		for (int i = n; i >= 0; i--) {
			boolean[] dp = new boolean[m + 1];
			for (int j = m; j >= 0; j--) {
				if (i == n && j == m) {

				}
			}
		}
		return true;
	}
}
