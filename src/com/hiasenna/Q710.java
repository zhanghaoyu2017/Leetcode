package com.hiasenna;

/**
 * @ClassName Q
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/8-11:51
 * @Version 1.0
 **/
public class Q710 {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null){
            return new TreeNode(val);
        }
        if (root.val < val) {
            root.right = insertIntoBST(root.right, val);
        }
        if (root.val > val){
            root.left = insertIntoBST(root.left,val);
        }
        return root;
    }
}
