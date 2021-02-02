package com.hiasenna;

/**
 * @ClassName Q95_Unique_Binary_Search_Trees_II
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/7/21-10:13
 * @Version 1.0
 **/

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 **/
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Q95_Unique_Binary_Search_Trees_II {


    public List<TreeNode> generateTrees(int n) {
        if (n==0){
            return new ArrayList<>();
        }
        return helper(1,n);
    }

    public List<TreeNode> helper(int start, int end) {
        List<TreeNode> res = new ArrayList<>();
        if (start > end){
            res.add(null);
            return res;
        }
        for (int i = start;i<=end;i++){
            List<TreeNode> leftChild = helper(start,i-1);
            List<TreeNode> rightChild  =helper(i+1,end);
            for (TreeNode left:leftChild){
                for (TreeNode right:rightChild){
                    TreeNode root = new TreeNode();
                    root.left = left;
                    root.right =right;
                    root.val = i;
                    res.add(root);
                }
            }
        }
        return res;
    }
}
