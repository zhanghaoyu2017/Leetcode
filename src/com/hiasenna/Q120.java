package com.hiasenna;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Q120 {

	
  //[2],
  //[3,4],
  //[6,5,7],
  //[4,1,8,3]

	public static void main(String[] args) {

	}
	 public static int minimumTotal(List<List<Integer>> triangle) {
		 //dp[i][j] 从(i,j)出发  最短路径
		 //dp[i][j] = min{dp[i+1][j],dp[i+1][j+1]}+triangle[i][j]
		 
		 int n = triangle.size();
		 List<Integer> pre = triangle.get(n-1);
		 for (int i = n-2; i >= 0 ; i--) {
			 List<Integer> dp = new ArrayList<Integer>();
			 for (int j = 0; j <= i; j++) {
				dp.add(triangle.get(i).get(j)+Math.min(pre.get(j),pre.get(j+1)));
			}
			 pre = new ArrayList<Integer>(dp);
		}
		 return pre.get(0);
	 }
	 
		public int minimumTotal2(List<List<Integer>> triangle) {
	        // 特判
	        if (triangle == null || triangle.size() == 0) {
	            return 0;
	        }
	        int row = triangle.size();
	        int column = triangle.get(row - 1).size();

	        int[][] dp = new int[row][column];
	        dp[0][0] = triangle.get(0).get(0);
	        int res = Integer.MAX_VALUE;

	        for (int i = 1; i < row; i++) {
	            //对每一行的元素进行推导
	            for (int j = 0; j <= i; j++) {
	                if (j == 0) {
	                    // 最左端特殊处理
	                    dp[i][j] = dp[i - 1][j] + triangle.get(i).get(j);
	                } else if (j == i) {
	                    // 最右端特殊处理
	                    dp[i][j] = dp[i - 1][j - 1] + triangle.get(i).get(j);
	                } else {
	                    dp[i][j] = Math.min(dp[i - 1][j], dp[i - 1][j - 1]) + triangle.get(i).get(j);
	                }
	            }
	        }

	        // dp最后一行记录了最小路径
	        for (int i = 0; i < column; i++) {
	            res = Math.min(res, dp[row - 1][i]);
	        }
	        return res;
	    }
	public static int minimumTotal3(List<List<Integer>> triangle) {
//		[2]
//		[3,4]
//		[6,5,7]
//		[4,1,8,3]
		//dp[i][j] 记录最小路径和
		//dp[i][j] = min{dp[i-1][j],dp[i-1][j+1]} + t[i]

		int row = triangle.size();
		List<Integer> col = triangle.get(row-1);
		int column = col.size();

		int[][] dp = new int[row][column];
		dp[0][0] = triangle.get(0).get(0);
		for (int i = 1;i<row;i++){
			for (int j = 0;j<=i;j++){
				if (j==0){
					dp[i][j] = dp[i-1][j]+triangle.get(i).get(j);
				}else if (i==j){
					dp[i][j] = dp[i-1][j-1]+triangle.get(i).get(j);
				}else {
					dp[i][j] = Math.min(dp[i-1][j-1],dp[i-1][j])+triangle.get(i).get(j);
				}
			}
		}
		int res = Integer.MAX_VALUE;
		for (int i = 0;i<column;i++){
			res = Math.min(res,dp[row-1][i]);
		}
		return res;

	}
}
