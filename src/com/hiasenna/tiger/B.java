package com.hiasenna.tiger;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @ClassName B
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/23-17:39
 * @Version 1.0
 **/
public class B {
    public static void main(String[] args) {
        int[] p = {3,8,6};
        ArrayList<ArrayList<Integer>> res = combinationSum(p,14);
        System.out.println(res.size());
        for (ArrayList<Integer> list: res){
            for (int i = 0;i<list.size();i++){
                System.out.println(list.get(i));
            }
        }
    }
    /**
     * 合适的股票每手价格组合
     * @param prices int整型一维数组 股票数量
     * @param m int整型 资产值
     * @return int整型ArrayList<ArrayList<>>
     */
    public static ArrayList<ArrayList<Integer>> combinationSum (int[] prices, int m) {
        // write code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        dfs(prices,m,0,res,new ArrayList<>());
        return res;
    }
    static void dfs(int[] prices, int m,int index, ArrayList<ArrayList<Integer>> res,ArrayList<Integer> chain){
        if (m==0){
            ArrayList<Integer> tmp= new ArrayList<>(chain);
            Collections.sort(tmp);
            if (!res.contains(tmp)){
                res.add(tmp);
                return;
            }
        }

        for (int i = index;i<prices.length;i++){
            int c = prices[i];
            chain.add(c);
            dfs(prices,m-c,index+1,res,chain);
            chain.remove(chain.size()-1);
        }
    }
}
