package com.hiasenna;

/**
 * @ClassName Q404
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/9/19-20:00
 * @Version 1.0
 **/
public class Q404_dfs {
    int sum = 0;

    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;
        dfs(root, 0);
        return sum;
    }

    //signal 标志位 1 左孩子 -1 右孩子
    void dfs(TreeNode root, int signal) {
        if (root.left == null && root.right == null && signal == 1) {
            sum += root.val;
        }
        if (root.left != null) {
            dfs(root.left, 1);
        }
        if (root.right != null) {
            dfs(root.right, -1);
        }
    }

}
