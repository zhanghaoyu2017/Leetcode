package com.hiasenna;

/**
 * @ClassName Q235
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/10-10:46
 * @Version 1.0
 **/
public class Q235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (p.val > root.val && q.val > root.val) {
            return lowestCommonAncestor(root.right,p,q);
        } else if (p.val < root.val && q.val < root.val) {
            return lowestCommonAncestor(root.left,p,q);
        } else {
            return root;
        }

    }
}
