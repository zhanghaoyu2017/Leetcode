package com.hiasenna;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName Q40_dfs
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/9/10-10:08
 * @Version 1.0
 **/
public class Q40_dfs {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        boolean[] visited = new boolean[candidates.length];
        dfs(candidates,target,res,new ArrayList<>(),visited);
        return res;
    }

    void dfs(int[] candidates, int target, List<List<Integer>> res, List<Integer> chain,boolean[] visited) {
        int s =sum(chain);
        if (s >= target){
            if (s==target){
                List<Integer> tmp = new ArrayList<>(chain);
                Collections.sort(tmp);
                if (!res.contains(tmp)){
                    res.add(tmp);
                    return;
                }
            }else return;
        }

        for (int i = 0;i<candidates.length;i++){
            int c = candidates[i];
            if (!visited[i]){
                chain.add(c);
                visited[i] = true;
                dfs(candidates,target,res,chain,visited);
                chain.remove(chain.size()-1);
                visited[i] = false;
            }

        }
    }
    private int sum(List<Integer> chain) {
        int res = 0;
        for (int i = 0; i < chain.size(); i++) {
            res += chain.get(i);
        }
        return res;
    }
}
