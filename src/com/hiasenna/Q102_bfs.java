package com.hiasenna;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @ClassName Q102
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/19-22:27
 * @Version 1.0
 **/
public class Q102_bfs {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
          int count = queue.size();
          List<Integer> list = new ArrayList<>();
          for (int i =0;i<count;i++){
              TreeNode node = queue.poll();
              list.add(node.val);
              if (node.left != null) queue.add(node.left);
              if (node.right != null) queue.add(node.right);
          }
          if (!list.isEmpty()){
              res.add(list);
          }
        }
        return res;
    }
}
