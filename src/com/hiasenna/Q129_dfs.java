package com.hiasenna;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Q129_dfs
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/19-11:54
 * @Version 1.0
 **/
public class Q129_dfs {
    public int sumNumbers(TreeNode root) {
        if (root == null) return 0;
        int res = 0;
        int chain = root.val;
        List<Integer> list = new ArrayList<>();
        dfs(root,chain,list);
        for (int i = 0;i<list.size();i++){
            res += list.get(i);
        }
        return res;

    }
    void dfs(TreeNode node,int chain,List<Integer> list){
        if (node.left == null && node.right == null){

            list.add(chain);
        }

        if (node.left != null){
            chain = chain*10+node.left.val;
            dfs(node.left,chain,list);
            chain = chain /10;
        }
        if (node.right != null){
            chain = chain*10+node.right.val;
            dfs(node.right,chain,list);
            chain = chain /10;
        }

    }
}
