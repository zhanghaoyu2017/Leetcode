package com.hiasenna;

/**
 * @ClassName Q61
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/3-11:10
 * @Version 1.0
 **/
public class Q61 {
    public static void main(String[] args) {

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        ListNode res = rotateRight(node1, 6);
        System.out.println(res.val);
    }

    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) {
            return head;
        }
        int length = 1;
        ListNode cur = head;
        while (cur.next != null) {
            length++;
            cur = cur.next;
        }
        int idx = k % length;
        if (idx == 0) return head;
        //首尾相连
        cur.next = head;
        // 现在只需要找到倒数第k+1个节点
        for (int i = 0; i < length - idx; i++) {
            cur = cur.next;
        }
        ListNode newHead = cur.next;
        cur.next = null;
        return newHead;

    }
}
