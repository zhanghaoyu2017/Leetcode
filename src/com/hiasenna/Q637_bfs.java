package com.hiasenna;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @ClassName Q637_bfs
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/9/12-16:32
 * @Version 1.0
 **/
public class Q637_bfs  {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();
        Queue<TreeNode> queue  = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int count = queue.size();
            double sum = 0;
            for (int i = 0;i<count;i++){
                TreeNode node = queue.poll();
                sum += node.val;
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            res.add(sum/count);

        }
        return res;
    }
}
