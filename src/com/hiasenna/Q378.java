package com.hiasenna;

import java.util.PriorityQueue;

import com.hiasenna.Q378.Pos;

public class Q378 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int kthSmallest(int[][] matrix, int k) {
		PriorityQueue<Pos> minHeap = new PriorityQueue<Pos>((o1,o2)
				->Integer.compare(matrix[o1.x][o1.y],matrix[o2.x][o2.y]));
		minHeap.add(new Pos(0,0));
		int n = matrix.length;
		int m = matrix[0].length;
		boolean[][] visited = new boolean[n][m];
		while (k >1) {
			Pos cur = minHeap.remove();
			k--;
			if(cur.y+1 < m) {
				int nx = cur.x;
				int ny = cur.y+1;
				if (!visited[nx][ny]) {
					minHeap.add(new Pos(nx,ny));	
				}
				visited[nx][ny] = true;
				
			}
			if(cur.x+1 < n) {
				int nx = cur.x+1;
				int ny = cur.y;
				if (!visited[nx][ny]) {
					minHeap.add(new Pos(nx,ny));	
				}
				visited[nx][ny] = true;
			}
		} 
		Pos p = minHeap.peek();
		return matrix[p.x][p.y];
    }
	static class Pos{
		int x;
		int y;
		public Pos(int x,int y) {
			this.x = x;
			this.y = y;
		}
	}
}
