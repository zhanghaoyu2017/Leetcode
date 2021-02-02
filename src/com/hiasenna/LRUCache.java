package com.hiasenna;

import java.util.LinkedHashMap;

/**
 * @ClassName LRUCache
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/29-11:09
 * @Version 1.0
 **/
public class LRUCache {
    int capacity;
    LinkedHashMap<Integer,Integer> cache = new LinkedHashMap<>();
    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        if (!cache.containsKey(key)){
            return -1;
        }
        //将key改为最近使用
        makeRecently(key);
        return cache.get(key);
    }

    public void put(int key, int value) {
        if (cache.containsKey(key)){
            makeRecently(key);
            cache.put(key,value);
            return;
        }

        if (cache.size()>=this.capacity){
            int oldest = cache.keySet().iterator().next();
            cache.remove(oldest);
        }
        cache.put(key,value);

    }
    public void makeRecently(int key){
        int val = cache.get(key);
        cache.remove(key);
        cache.put(key,val);
    }
}
