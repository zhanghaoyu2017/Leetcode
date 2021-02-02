package com.hiasenna;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName Q39_dfs
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/15-23:38
 * @Version 1.0
 **/
public class Q39_dfs {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(target, candidates, res, new ArrayList<>());
        return res;
    }

    void dfs(int target, int[] candidates, List<List<Integer>> res, List<Integer> chain) {
        //截止条件
        int s = sum(chain);
        if (s >= target) {
            if (s == target) {
                List<Integer> tmp = new ArrayList<>(chain);
                Collections.sort(tmp);
                if (!res.contains(tmp)) {
                    res.add(tmp);
                }
            } else return;
        }
        //候选条件
        for (int i = 0; i < candidates.length; i++) {
            int c = candidates[i];
            chain.add(c);
            dfs(target, candidates, res, chain);
            chain.remove(chain.size() - 1);
        }
    }

    private int sum(List<Integer> chain) {
        int res = 0;
        for (int i = 0; i < chain.size(); i++) {
            res += chain.get(i);
        }
        return res;
    }

    void dfs2(int target, int[] candidates, List<List<Integer>> res, List<Integer> chain) {
        int s = sum(chain);
        if (s >= target) {
            if (s==target){
                List<Integer> tmp = new ArrayList<>(chain);
                Collections.sort(tmp);
                if (!res.contains(tmp)){
                    res.add(tmp);
                }
            }else {
                return;
            }
        }

        for (int i = 0;i<candidates.length;i++){
            int k = candidates[i];
            chain.add(k);
            dfs2(target, candidates, res, chain);
            chain.remove(chain.size() - 1);
        }
    }
}
