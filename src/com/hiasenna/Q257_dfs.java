package com.hiasenna;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Q257
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/9/7-17:35
 * @Version 1.0
 **/
public class Q257_dfs {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        dfs(res,root,"");
        return res;
    }

    void dfs(List<String> res, TreeNode node, String chain) {
        if (node != null){
            chain += node.val;
            if (node.left == null && node.right == null){
                //叶子节点
                res.add(chain);
            }else{
                chain += "->";
                dfs(res,node.left,chain);
                dfs(res,node.right,chain);
            }
        }
    }
}
