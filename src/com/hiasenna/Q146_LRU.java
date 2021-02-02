package com.hiasenna;

import javax.swing.*;
import java.util.LinkedHashMap;

/**
 * @ClassName Q146_LRU 最近最少使用
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/29-10:42
 * @Version 1.0
 **/
public class Q146_LRU {
    int cap;
    LinkedHashMap<Integer,Integer> cache = new LinkedHashMap<>();
    public Q146_LRU(int capacity) {
        this.cap = capacity;
    }

    public int get(int key) {
        if (!cache.containsKey(key)){
            return -1;
        }
        //将key变为最近使用
        makeRecently(key);
        //返回
        return cache.get(key);
    }

    public void put(int key, int value) {
        if (cache.containsKey(key)){
            //修改key的值
            cache.put(key,value);
            makeRecently(key);
            return;
        }
        if (cache.size() >= this.cap){
            //链表头部是最久未使用的
            int oldestKey = cache.keySet().iterator().next();
            cache.remove(oldestKey);
        }
        cache.put(key,value);
    }
    private void makeRecently(int key) {
        int val = cache.get(key);
        cache.remove(key);
        cache.put(key,val);
    }
}
/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */