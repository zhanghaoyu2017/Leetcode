package com.hiasenna;

/**
 * @ClassName Q226
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/9/16-10:29
 * @Version 1.0
 **/
public class Q226 {

    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }
}
