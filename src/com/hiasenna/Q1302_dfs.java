package com.hiasenna;

/**
 * @ClassName Q1302_dfs
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/4-17:02
 * @Version 1.0
 **/
public class Q1302_dfs {

    int sum = 0;
    int deepest = 0;

    public int deepestLeavesSum(TreeNode root) {

        dfs(root, 0);
        return sum;
    }

    public void dfs(TreeNode node, int level) {
        if (node == null) return;
        if (node.left == null && node.right == null) {
            if (level > deepest) {
                //有更深层的叶子节点
                sum = node.val;
                deepest = level;
            }else if (level == deepest){
                //最深层的其他叶子节点
                sum += node.val;
            }
        }
        dfs(node.left, level + 1);
        dfs(node.right, level + 1);


    }

}
