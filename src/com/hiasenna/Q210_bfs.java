package com.hiasenna;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @ClassName Q210_bfs
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/21-11:29
 * @Version 1.0
 **/
public class Q210_bfs {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] indegree  = new int[numCourses];
        int[] res = new int[numCourses];
        int index = 0;
        int count = 0;
        List<List<Integer>> adjacency = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0;i<numCourses;i++){
            adjacency.add(new ArrayList<>());
        }
        for (int[] cp:prerequisites){
            indegree[cp[0]]++;
            adjacency.get(cp[1]).add(cp[0]);
        }
        for (int i = 0;i<numCourses;i++){
            if (indegree[i] == 0) queue.add(i);
        }
        while (!queue.isEmpty()){
            int pre = queue.peek();
            res[index] = queue.poll();
            count++;
            index++;
            for (int cur : adjacency.get(pre)){
                indegree[cur]--;
                if (indegree[cur] == 0 ){
                    queue.add(cur);
                }
            }
        }
        if (count == numCourses) return res;
        else return new int[0];
    }


    // 方法 1 最简单的 BFS
    public int[] findOrder2(int numCourses, int[][] prerequisites) {
        if (numCourses == 0) return new int[0];
        int[] inDegrees = new int[numCourses];
        // 建立入度表
        for (int[] p : prerequisites) { // 对于有先修课的课程，计算有几门先修课
            inDegrees[p[0]]++;
        }
        // 入度为0的节点队列
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < inDegrees.length; i++) {
            if (inDegrees[i] == 0) queue.offer(i);
        }
        int count = 0;  // 记录可以学完的课程数量
        int[] res = new int[numCourses];  // 可以学完的课程
        // 根据提供的先修课列表，删除入度为 0 的节点
        while (!queue.isEmpty()){
            int curr = queue.poll();
            res[count++] = curr;   // 将可以学完的课程加入结果当中
            for (int[] p : prerequisites) {
                if (p[1] == curr){
                    inDegrees[p[0]]--;
                    if (inDegrees[p[0]] == 0) queue.offer(p[0]);
                }
            }
        }
        if (count == numCourses) return res;
        return new int[0];
    }

}
