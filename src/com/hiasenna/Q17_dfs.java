package com.hiasenna;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Q17
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/15-22:50
 * @Version 1.0
 **/
public class Q17_dfs {

    char[][] m = {{}, {}, {'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'},
            {'j', 'k', 'l'}, {'m', 'n', 'o'}, {'p', 'q', 'r', 's'}, {'t', 'u', 'v'}, {'w', 'x', 'y', 'z'}};

    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits.length() == 0) return res;
        dfs(digits,0,new StringBuilder(),res);
        return res;
    }

    void dfs(String str, int index, StringBuilder sb, List<String> res) {
        //1.截止条件
        if (index == str.length()){
            res.add(sb.toString());
            return;
        }
        //2.候选节点
        for (char c : m[str.charAt(index) - '0']){
            sb.append(c);
            dfs(str,index+1,sb,res);
            sb.deleteCharAt(sb.length()-1);
        }
    }

    void dfs2(String str, int index, StringBuilder sb, List<String> res) {
        if (index == str.length()){
            res.add(sb.toString());
            return;
        }
        for (char c : m[str.charAt(index)- '0'] ){
            sb.append(c);
            dfs2(str,index+1,sb,res);
            sb.deleteCharAt(sb.length()-1);
        }

    }
}
