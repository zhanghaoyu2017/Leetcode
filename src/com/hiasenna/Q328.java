package com.hiasenna;

/**
 * @ClassName Q328
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/23-17:55
 * @Version 1.0
 **/
public class Q328 {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        // head 为奇链表头结点，o 为奇链表尾节点
        ListNode o = head;
        // p 为偶链表头结点 最后拼接使用
        ListNode p = head.next;
        // e 为偶链表尾节点
        ListNode e = p;
        while (o.next != null && e.next != null) {
            o.next = e.next;
            o = o.next;
            e.next = o.next;
            e = e.next;
        }
        o.next = p;
        return head;
    }
}
