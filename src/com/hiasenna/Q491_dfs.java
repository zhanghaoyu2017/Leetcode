package com.hiasenna;

import java.util.*;

/**
 * @ClassName Q491_dfs
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/25-9:39
 * @Version 1.0
 **/
public class Q491_dfs {
    Set<List<Integer>> set = new HashSet<>();

    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(nums, new ArrayList<>(), res, 0);
        return res;
    }

    void dfs(int[] nums, List<Integer> chain, List<List<Integer>> res, int index) {
        if (chain.size() >= 2 && !set.contains(chain)) {
            List<Integer> tmp = new ArrayList<>(chain);
            res.add(tmp);
            set.add(tmp);
        }
        if (index >= nums.length) return;
        for (int i = index; i < nums.length; i++) {
            if (chain.size() == 0 || nums[i] >= chain.get(chain.size() - 1)) {
                chain.add(nums[i]);
                dfs(nums, chain, res, i + 1);
                chain.remove(chain.size() - 1);
            } else {
                continue;
            }

        }
    }
}
