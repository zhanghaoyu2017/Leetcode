package com.hiasenna;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Q113
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/19-11:27
 * @Version 1.0
 **/
public class Q113_dfs {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        List<Integer> chain = new ArrayList<>();
        chain.add(root.val);
        sum -= root.val;
        dfs(root,sum,chain,res);
        return res;
    }

    void dfs(TreeNode node, int sum, List<Integer> chain, List<List<Integer>> res) {
        //1.截止条件
        if (node.left == null && node.right == null) {
            if (sum == 0) {
                res.add(new ArrayList<>(chain));
            }
        }
        //2.候选节点
        if (node.left != null){
            chain.add(node.left.val);
            dfs(node.left,sum - node.left.val,chain,res);
            chain.remove(chain.size()-1);
        }

        if (node.right != null){
            chain.add(node.right.val);
            dfs(node.right,sum - node.right.val,chain,res);
            chain.remove(chain.size()-1);
        }
    }
}
