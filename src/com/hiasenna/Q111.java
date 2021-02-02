package com.hiasenna;

import java.util.Map;

/**
 * @ClassName Q111
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/21-10:04
 * @Version 1.0
 **/
public class Q111 {
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        if (root.left == null && root.right == null) return 1;
        int res = 0;
        res = Integer.MAX_VALUE;
        if (root.left != null) res = Math.min(minDepth(root.left),res);
        if (root.right != null) res = Math.min(minDepth(root.right),res);
        return  res+1;

    }
    public int minDepth2(TreeNode root) {
        if(root == null) return 0;
        //这道题递归条件里分为三种情况
        //1.左孩子和有孩子都为空的情况，说明到达了叶子节点，直接返回1即可
        if(root.left == null && root.right == null) return 1;
        //2.如果左孩子和由孩子其中一个为空，那么需要返回比较大的那个孩子的深度
        int m1 = minDepth(root.left);
        int m2 = minDepth(root.right);
        //这里其中一个节点为空，说明m1和m2有一个必然为0，所以可以返回m1 + m2 + 1;
        if(root.left == null || root.right == null) return m1 + m2 + 1;

        //3.最后一种情况，也就是左右孩子都不为空，返回最小深度+1即可
        return Math.min(m1,m2) + 1;
    }


}
