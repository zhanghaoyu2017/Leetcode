package com.hiasenna;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassName Q104
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/7/28-9:31
 * @Version 1.0
 **/
public class Q104 {
    public int maxDepth(TreeNode root) {
        if (root == null) return  0;
        else {
            int left = maxDepth(root.left);
            int right  = maxDepth(root.right);
            return Math.max(left,right)+1;
        }
    }

    //广度优先 BFS
    public int maxDepth2(TreeNode root) {
        if (root == null) return  0;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        int ans = 0;
        while (!queue.isEmpty()){
            int size = queue.size();
            while (size > 0 ){
                TreeNode node = queue.poll();
                if (node.left != null){
                    queue.offer(node.left);
                }
                if (node.right != null){
                    queue.offer(node.right);
                }
                size--;
            }
            ans++;
        }
        return ans;
    }
}

