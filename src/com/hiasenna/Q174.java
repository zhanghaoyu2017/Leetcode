package com.hiasenna;

import java.util.Iterator;

public class Q174 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	} 
	public static int calculateMinimumHP(int[][] dungeon) {
       //dp[i][j]:从(i,j)出发所需的最小初始血量值
		//dp[i][j] + d[i][j] >= min{dp[i+1][j],dp[i][j+1]}
		//移项 dp[i][j] = max{1,min{dp[i+1][j] - d[i][j],dp[i][j+1] - d[i][j]}}
		//dp[n][m]  = max{1,1-d[n][m]}
		
		
		int n = dungeon.length;
		int m = dungeon[0].length;
		int[][] dp = new int [n][m]; 
		for(int i = n-1;i>=0;i--) {
			for(int j = m-1;j>=0;j--) {
				//边界条件
				 if(i==n-1 && j==m-1) {
					 dp[i][j] = Math.max(1, 1-dungeon[i][j]);
					 continue;
				 }
				 int min = Integer.MAX_VALUE;
				 if(i+1 < n) {
					 min = dp[i+1][j] - dungeon[i][j];
				 }
				 if (j+1< m) {
					min = Math.min(min, dp[i][j+1] - dungeon[i][j]);
				}
				 dp[i][j] = Math.max(1, min);
			}
		}
		
		return dp[0][0];
    }
	
	public static int calculateMinimumHP2(int[][] dungeon) {
		int row=dungeon.length;
        int col=dungeon[0].length;
        //这个数组表示在i,j位置骑士需要的最小生命值
        int[][] dp=new int[row][col];
        for(int i=row-1;i>=0;i--){
        	for(int j=col-1;j>=0;j--){
        		if(i==row-1&&j==col-1){ //终点的情况
        			dp[i][j]=Math.max(1, 1-dungeon[i][j]);
        		}else if(i==row-1){ //最后一行的情况
        			dp[i][j]=Math.max(1, dp[i][j+1]-dungeon[i][j]);
        		}else if(j==col-1){ //最后一列的情况
        			dp[i][j]=Math.max(1, dp[i+1][j]-dungeon[i][j]);
        		}else{	
        			dp[i][j]=Math.max(1, Math.min(dp[i+1][j],dp[i][j+1])-dungeon[i][j]);
        		}
        	}
        }
        return dp[0][0];
	}

}
