package com.hiasenna;

/**
 * @ClassName Q237
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/7/28-16:32
 * @Version 1.0
 **/
public class Q237 {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
