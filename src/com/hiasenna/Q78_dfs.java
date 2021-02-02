package com.hiasenna;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName Q78_dfs
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/9/20-19:50
 * @Version 1.0
 **/
public class Q78_dfs {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(nums,res,new ArrayList<>(),0);
        return res;
    }

    void dfs(int[] nums, List<List<Integer>> res,List<Integer> chain,int index){
            List<Integer> tmp = new ArrayList<>(chain);
                res.add(tmp);


        for (int i =index;i<nums.length;i++){
            int c = nums[i];
            chain.add(c);
            dfs(nums,res,chain,i+1);
            chain.remove(chain.size()-1);
        }
    }
}
