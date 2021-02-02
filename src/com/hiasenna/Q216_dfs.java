package com.hiasenna;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName Q216_dfs
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/9/11-12:02
 * @Version 1.0
 **/
public class Q216_dfs {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(res,new ArrayList<>(),k,n,1);
        return res;
    }

    void dfs(List<List<Integer>> res, List<Integer> chain, int k, int n,int index) {
        if (chain.size() == k || n <= 0) {
            if (chain.size() == k && n == 0) {
                List<Integer> tmp = new ArrayList<>(chain);
                Collections.sort(tmp);
                if (!res.contains(tmp)) {
                    res.add(tmp);
                }
            }
        }
        for (int i = index; i <= 9; i++) {
            chain.add(i);
            dfs(res,chain,k,n-i,i+1);
            chain.remove(chain.size()-1);
        }
    }
}
