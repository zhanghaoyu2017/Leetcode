package com.hiasenna;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName Q47
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/17-23:08
 * @Version 1.0
 **/
public class Q47 {
    public static void main(String[] args) {
        int[] a = {1, 1, 2};
        System.out.println(permuteUnique(a));
    }

    public static List<List<Integer>> permuteUnique(int[] nums) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int i : nums) {
            m.put(i, m.containsKey(i) ? m.get(i) + 1 : 1);
        }
        int len = m.size();
        int[] p = new int[len];
        int[] pb = new int[len];
        int index = 0;
        for (Map.Entry<Integer, Integer> map : m.entrySet()) {
            p[index] = map.getKey();
            pb[index++] = map.getValue();
        }
        List<List<Integer>> res = new ArrayList<>();
        dfs(nums.length, p, pb, res, new ArrayList<>());
        return res;
    }

    static void dfs(int size, int[] p, int[] pb, List<List<Integer>> res, List<Integer> chain) {
        //截止条件
        if (chain.size() == size) {
            res.add(new ArrayList<>(chain));
            return;
        }
        //2.候选节点
        for (int i = 0; i < p.length; i++) {
            int c = p[i];
            if (pb[i] > 0) {
                chain.add(p[i]);
                pb[i]--;
                dfs(size, p, pb, res, chain);
                chain.remove(chain.size() - 1);
                pb[i]++;
            }
        }

    }


    public static List<List<Integer>> permuteUnique2(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.containsKey(i) ? map.get(i) + 1 : 1);
        }
        int len = map.size();
        int[] p = new int[len];
        int[] pb = new int[len];
        int index = 0;
        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            p[index] = m.getKey();
            pb[index++] = m.getValue();
        }
        dfs(nums.length, p, pb, res, new ArrayList<>());
        return res;
    }

    static void dfs2(int size, int[] p, int[] pb, List<List<Integer>> res, List<Integer> chain) {
        //截止条件
        if (chain.size() == size) {
            res.add(new ArrayList<>(chain));
            return;
        }
        //候选节点
        for (int i = 0; i < p.length; i++) {
            int c = p[i];
            if (pb[i] > 0) {
                pb[i]--;
                chain.add(p[i]);
                dfs(size, p, pb, res, chain);
                chain.remove(chain.size() - 1);
                pb[i]++;
            }
        }

    }

    public static List<List<Integer>> permuteUnique3(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i =0;i<nums.length;i++){
            if (map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else {
                map.put(nums[i],1);
            }
        }

        int[] p = new int[nums.length];
        int[] pb = new int[nums.length];
        int index = 0;
        for (Map.Entry<Integer,Integer> m:map.entrySet()){
            p[index] = m.getKey();
            pb[index] = m.getValue();
            index++;
        }

        dfs3(nums.length,p,pb,res,new ArrayList<>());
        return res;

    }
    static void dfs3(int size, int[] p, int[] pb, List<List<Integer>> res, List<Integer> chain) {
        if (chain.size() == size){
            res.add(new ArrayList<>(chain));
            return;
        }


        for (int i = 0;i<p.length;i++){
            int c = p[i];
            if (pb[i] > 0){
                pb[i]--;
                chain.add(c);
                dfs3(size,p,pb,res,chain);
                chain.remove(chain.size()-1);
                pb[i]++;
            }
        }
    }
}
