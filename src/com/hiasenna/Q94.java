package com.hiasenna;

import java.util.*;

/**
 * @ClassName Q94
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/9/14-11:45
 * @Version 1.0
 **/
public class Q94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorder(res, root);
        return res;
    }

    public void inorder(List<Integer> res, TreeNode root) {
        if (root == null) return;
        inorder(res,root.left);
        res.add(root.val);
        inorder(res,root.right);
    }



    public List<Integer> inorderTraversal2(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()) {
            if (cur != null) {
                stack.push(cur);
                cur = cur.left;
            } else {
                cur = stack.pop();
                list.add(cur.val);
                cur = cur.right;
            }
        }
        return list;
    }
}
