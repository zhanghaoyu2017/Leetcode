package com.hiasenna;

import java.util.List;

/**
 * @ClassName Q841
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/31-11:30
 * @Version 1.0
 **/
public class Q841 {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[] ans = new boolean[n];

        for (int j = 0; j < rooms.size(); j++) {
            List<Integer> list = rooms.get(j);
            if (list != null) {
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i) != j) {
                        ans[list.get(i)] = true;
                    }
                }

            }
        }

        for (int i = 1; i < n; i++) {
            if (!ans[i]) {
                return false;
            }
        }
        return true;

    }
    public boolean canVisitAllRooms2(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[] visited = new boolean[n];
        dfs(visited,rooms,0);
        for (boolean b:visited){
            if (!b) return false;
        }
        return true;
    }
    void dfs(boolean[] visited,List<List<Integer>> rooms,int index){
        if (visited[index]) return;
        visited[index] = true;
        for (int i:rooms.get(index)){
            dfs(visited,rooms,i);
        }
    }
}
