package com.hiasenna;


import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Q114
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/2-21:39
 * @Version 1.0
 **/
public class Q114 {
    public void flatten(TreeNode root) {
        List<TreeNode> list = new ArrayList<TreeNode>();
        preorderTraversal(root, list);
        int size = list.size();
        for (int i = 1; i < size; i++) {
            TreeNode prev = list.get(i - 1), curr = list.get(i);
            prev.left = null;
            prev.right = curr;
        }
    }

    public void preorderTraversal(TreeNode root, List<TreeNode> list) {
        if (root != null) {
            list.add(root);
            preorderTraversal(root.left, list);
            preorderTraversal(root.right, list);
        }
    }

}
