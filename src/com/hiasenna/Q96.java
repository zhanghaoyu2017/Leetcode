package com.hiasenna;

import java.util.Iterator;

public class Q96 {

	public static void main(String[] args) {
		System.out.println(numTrees2(3));

	}
	public static int numTrees(int n) {
		//[1,2,.......i....n]
		//[1,i-1] i [i+1,n]
		//能够组成的节点   f(i-1) * f(n-1-(i+1)) => f(i-1) * f(n-i)
		//f(n) = sum(f(i-1) * f(n-i)) i:[1,n]
		int[] f = new int[n+1] ;
		f[0] = 1 ;
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j <=i-1; j++) {
				f[i] += f[j]*f[i-1-j];
			}	
		}	
		return f[n];
    }
	public static int numTrees2(int n) {
		int[] dp = new int[n+1];
		dp[0] = 1;
		dp[1] = 1;
		for (int i = 2; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				dp[i] += dp[j-1] * dp[i-j];
			}
		}
		return dp[n];
    }
}
