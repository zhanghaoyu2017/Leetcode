package com.hiasenna;

import java.util.Iterator;

public class Q785 {

	public static void main(String[] args) {

	}
	
	 public static boolean isBipartite(int[][] graph) {
		 // set 0:没划分  1：划分到集合A  -1：划分到集合B
		 int[] set = new int[graph.length];
		 for (int i = 0; i < graph.length; i++) {
			if (set[i] != 0) {
				continue;
			}
			if(!dfs(graph, i, 1, set) && !dfs(graph, i, -1, set)) {
				return false;
			}
			
		}
		 
		 return true;
	 }
	 public static boolean dfs(int[][] graph,int node, int flag, int[] set) {
		 if (set[node] != 0) {
			//已划分
			 return flag ==  set[node];
		}
		 set[node] = flag;
		 for (int i : graph[node]) {
			if(!dfs(graph, i, -flag, set)) {
				set[node] = 0;
				return false;
			}
		}
		 return true;
	 }
	 
	 public static boolean dfs2(int[][] graph,int node, int flag, int[] set) {
		 if (set[node] != 0) {
			return flag == set[node];
		}
		 set[node] = flag;
		 for (int i : graph[node]) {
			if (!dfs2(graph, i, flag, set)) {
				set[node] = 0; 
				return false;
			}
		}
		 
		 return true;
	 }

}
