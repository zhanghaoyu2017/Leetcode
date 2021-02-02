package com.hiasenna;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @ClassName Q559
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/4-21:41
 * @Version 1.0
 **/

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};

public class Q559 {
    public int maxDepth1(Node root) {
        if (root == null) return 0;
        int max = 0;
        for (Node node : root.children){
            int depth = maxDepth1(node);
            max = Math.max(max,depth);
        }
        return max+1;
    }

    //迭代：层序遍历
    public int maxDepth2(Node root) {
        if (root == null) return 0;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int maxDepth = 0;
        while (!queue.isEmpty()){
            int count  = queue.size();
            maxDepth++;
            while (count > 0){
                count--;
                Node cur = queue.poll();
                for (Node node :root.children){
                    if(node != null){
                        queue.add(node);
                    }
                }
            }
        }
        return maxDepth;
    }
}
