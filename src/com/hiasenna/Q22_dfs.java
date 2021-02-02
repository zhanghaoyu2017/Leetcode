package com.hiasenna;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Q22_dfs
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/18-17:53
 * @Version 1.0
 **/
public class Q22_dfs {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        char[] p1 = {'(',')'};
        int[] p2 = {n,n};

        dfs(p1,p2,res,new String(),n);
        return res;
    }
    void dfs(char[] p1,int[] p2,List<String> res,String chain,int n){
        if (chain.length() == n*2){
            res.add(chain);
            return;
        }
        //右号和左括号数量相等时不能加入
        if (p2[0] > 0){
            p2[0]--;
            dfs(p1,p2,res,chain+p1[0],n);
            p2[0]++;
            //传入的chain 是新建了一个对象传入的 所以不用还原回来
        }
        if (p2[1] > 0){
            if (p2[1]!=p2[0]){
                p2[1]--;
                dfs(p1,p2,res,chain+p1[1],n);
                p2[1]++;
            }
        }
    }
}
