package com.hiasenna;

import java.util.*;

/**
 * @ClassName Q347
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/9/7-17:22
 * @Version 1.0
 **/
public class Q347 {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        ///统计次数
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return map.get(o1) - map.get(o2);
            }
        });
        for (Integer key:map.keySet()){
            if (pq.size()<k){
                pq.add(key);
            }else if (map.get(key)>map.get(pq.peek())){
                pq.remove();
                pq.add(key);
            }
        }
        int[] res = new int[k];
        for (int i = 0;i<k;i++){
            res[i] = pq.poll();
        }
        return res;

    }
}
