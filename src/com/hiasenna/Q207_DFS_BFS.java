package com.hiasenna;

import java.util.*;

/**
 * @ClassName Q207
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/4-10:35
 * @Version 1.0
 **/
public class Q207_DFS_BFS {
    //bfs

//    算法流程：
//    统计课程安排图中每个节点的入度，生成 入度表 indegrees。
//    借助一个队列 queue，将所有入度为 0 的节点入队。
//    当 queue 非空时，依次将队首节点出队，在课程安排图中删除此节点 pre：
//    并不是真正从邻接表中删除此节点 pre，而是将此节点对应所有邻接节点 cur 的入度 -1，即 indegrees[cur] -= 1。
//    当入度 -1后邻接节点 cur 的入度为 0，说明 cur 所有的前驱节点已经被 “删除”，此时将 cur 入队。
//    在每次 pre 出队时，执行 numCourses--；
//    若整个课程安排图是有向无环图（即可以安排），则所有节点一定都入队并出队过，即完成拓扑排序。换个角度说，若课程安排图中存在环，
//    一定有节点的入度始终不为 0。
//    因此，拓扑排序出队次数等于课程个数，返回 numCourses == 0 判断课程是否可以成功安排。

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] indegrees = new int[numCourses];
        List<List<Integer>> adjacency = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++)
            adjacency.add(new ArrayList<>());
        // Get the indegree and adjacency of every course.
        for (int[] cp : prerequisites) {
            indegrees[cp[0]]++;
            adjacency.get(cp[1]).add(cp[0]);
        }
        // Get all the courses with the indegree of 0.
        for (int i = 0; i < numCourses; i++)
            if (indegrees[i] == 0) queue.add(i);
        // BFS TopSort.
        while (!queue.isEmpty()) {
            int pre = queue.poll();
            numCourses--;
            //把依赖这个课程的入度 -1
            for (int cur : adjacency.get(pre)){
                indegrees[cur]--;
                if (indegrees[cur] == 0) queue.add(cur);

            }
        }
        return numCourses == 0;
    }
    public boolean canFinishbfs(int numCourses, int[][] prerequisites) {
      int[] indegree = new int[numCourses];//依赖其他课程的数量
      Queue<Integer> queue = new LinkedList<>();
      List<List<Integer>> adjacency = new ArrayList<>();
      for (int i =0;i<numCourses;i++){
          adjacency.add(new ArrayList<>());
      }
      for (int[] cp:prerequisites){
          indegree[cp[0]]++;
          adjacency.get(cp[1]).add(cp[0]);
      }
      //将入度为0的点入队
        for (int i = 0;i<numCourses;i++){
            if (indegree[i] == 0)
                queue.add(i);
        }
        //bfs
        while (!queue.isEmpty()){
            int pre = queue.poll();
            numCourses--;
            for (int cur:adjacency.get(pre)){
                indegree[cur]--;
                if (indegree[cur] == 0) queue.add(cur);
            }
        }
        return numCourses == 0;
    }

    //dfs
//    算法流程：
//    借助一个标志列表 flags，用于判断每个节点 i （课程）的状态：
//    未被 DFS 访问：i == 0；
//    已被其他节点启动的 DFS 访问：i == -1；
//    已被当前节点启动的 DFS 访问：i == 1。
//    对 numCourses 个节点依次执行 DFS，判断每个节点起步 DFS 是否存在环，若存在环直接返回 FalseFalse。DFS 流程；
//    终止条件：
//    当 flag[i] == -1，说明当前访问节点已被其他节点启动的 DFS 访问，无需再重复搜索，直接返回 TrueTrue。
//    当 flag[i] == 1，说明在本轮 DFS 搜索中节点 i 被第 2 次访问，即 课程安排图有环 ，直接返回 FalseFalse。
//    将当前访问节点 i 对应 flag[i] 置 1，即标记其被本轮 DFS 访问过；
//    递归访问当前节点 i 的所有邻接节点 j，当发现环直接返回 FalseFalse；
//    当前节点所有邻接节点已被遍历，并没有发现环，则将当前节点 flag 置为 -1 并返回 TrueTrue。
//    若整个图 DFS 结束并未发现环，返回 TrueTrue。
    public boolean canFinish2(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adjacency = new ArrayList<>();
        for(int i = 0; i < numCourses; i++)
            adjacency.add(new ArrayList<>());
        int[] flags = new int[numCourses];
        for(int[] cp : prerequisites)
            adjacency.get(cp[1]).add(cp[0]);
        for(int i = 0; i < numCourses; i++)
            if(!dfs(adjacency, flags, i)) return false;
        return true;
    }
    private boolean dfs(List<List<Integer>> adjacency, int[] flags, int i) {
        if(flags[i] == 1) return false;
        if(flags[i] == -1) return true;
        flags[i] = 1;
        for(Integer j : adjacency.get(i))
            if(!dfs(adjacency, flags, j)) return false;
        flags[i] = -1;
        return true;
    }

    //dfs test
    public boolean canFinish3(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adjacency = new ArrayList<>();
        for (int i = 0;i<numCourses;i++){
            adjacency.add(new ArrayList<>());
        }
        int[] flags = new int[numCourses];
        for (int[] cp : prerequisites ){
            adjacency.get(cp[1]).add(cp[0]);
        }
        //dfs
        for(int i = 0; i < numCourses; i++)
            if(!dfs(adjacency, flags, i)) return false;
        return true;
    }
    private boolean dfs2(List<List<Integer>> adjacency, int[] flags, int i) {
        if (flags[i] == 1) return false;
        if (flags[i] == -1) return true;
        flags[i] = 1;
        for (Integer j : adjacency.get(i)){
            if (!dfs2(adjacency,flags,j)) return false;
        }
        flags[i]  = -1;
        return true;
    }





}
