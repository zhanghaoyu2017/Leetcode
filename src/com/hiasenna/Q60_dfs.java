package com.hiasenna;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Q60_dfs
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/9/7-17:44
 * @Version 1.0
 **/
public class Q60_dfs {
    public String getPermutation(int n, int k) {
        List<String> res = new ArrayList<>();
        boolean[] visited = new boolean[n];
        dfs(res,n,k,"",visited);
        return res.get(k-1);

    }

    void dfs(List<String> res, int n, int k, String chain, boolean[] visited) {
        if (res.size() == k) return;
        if (chain.length() == n) {
            res.add(chain);
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (visited[i - 1]) continue;
            visited[i - 1] = true;
            chain += i;
            dfs(res, n, k, chain, visited);
            visited[i - 1] = false;
            chain = chain.substring(0, chain.length() - 1);
        }

    }

}
