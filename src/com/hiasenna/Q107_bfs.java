package com.hiasenna;

import java.util.*;

/**
 * @ClassName Q107_bfs
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/9/7-17:58
 * @Version 1.0
 **/
public class Q107_bfs {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int count = queue.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < count; i++) {
                TreeNode node = queue.poll();
                list.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }

            if (!list.isEmpty()) {
                res.add(list);
            }
        }
//        List<List<Integer>> tmp = new ArrayList<>();
//        for (int i = res.size() - 1; i >= 0; i--) {
//            tmp.add(res.get(i));
//        }
        Collections.reverse(res);
        return res;
    }
}
