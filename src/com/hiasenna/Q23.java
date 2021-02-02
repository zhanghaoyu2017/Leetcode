package com.hiasenna;

import java.util.PriorityQueue;

/**
 * @ClassName Q23
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/5-17:03
 * @Version 1.0
 **/
public class Q23 {
    public ListNode mergeKLists(ListNode[] lists) {
        int len = lists.length;
        if (len == 0) return null;

        //将k个链表合并
        while(len>1) {
            for (int i=0; i<len/2; i++) {
                lists[i] = mergeTwoLists(lists[i], lists[len-1-i]);
            }
            len = (len+1)/2;
        }
        return lists[0];
    }
    // 合并两个链表
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newHead = new ListNode(0);
        ListNode cur = newHead;
        while (l1.next != null && l2.next != null){
            if (l1.val < l2.val){
                cur.next = l1;
                l1 = l1.next;
                cur = cur.next;
            }else {
                cur.next = l2;
                l2 = l2.next;
                cur = cur.next;
            }
        }
        if (l1 == null) cur.next = l2;
        else  {
            cur.next =l1;
        }
        return newHead.next;
    }

    //小根堆
    public ListNode mergeKLists2(ListNode[] lists) {
        PriorityQueue<ListNode> queue = new PriorityQueue<>((o1, o2) -> o1.val - o2.val);
        for (ListNode node : lists){
            if (node != null) queue.offer(node);
        }
        ListNode dummyHead = new ListNode(0);
        ListNode cur = dummyHead;
        while (!queue.isEmpty()){
            ListNode minNode = queue.poll();
            cur.next = minNode;
            cur = cur.next;
            if (minNode.next != null) queue.offer(minNode.next);
        }
        return dummyHead.next;
    }
}
