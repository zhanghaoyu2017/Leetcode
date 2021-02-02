package com.hiasenna;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * @ClassName Q279_bfs
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/21-18:27
 * @Version 1.0
 **/
public class Q279_bfs {
    public int numSquares(int n) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        queue.add(n);
        int level = 0;
        while (!queue.isEmpty()){
            int len = queue.size();
            level++;
            for (int i =0;i<len;i++){
                int num = queue.poll();
                for (int j = 1;j*j<=num;j++){
                    int next = num-j*j;
                    if (next == 0){
                        //找完所有平方
                        return level;
                    }
                    if (!visited.contains(next)){
                        queue.add(next);
                        visited.add(next);
                    }
                }
            }
        }
        return 0;
    }
}
