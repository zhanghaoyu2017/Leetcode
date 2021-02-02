package com.hiasenna;



/**
 * @ClassName Q148
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/5-10:12
 * @Version 1.0
 **/
public class Q148 {
    public ListNode sortList(ListNode head) {
        // 1、递归结束条件
        if (head == null || head.next == null) {
            return head;
        }
        //2、找到链表中间节点并断开 & 递归下探
        ListNode midNode= middleNode(head);
        ListNode rightHead = midNode.next;
        midNode.next = null;

        ListNode left = sortList(head);
        ListNode right = sortList(rightHead);

        //3.当前业务操作（合并有序链表）
        return mergeTwoLists(left,right);
    }

    //  找到链表中间节点（876. 链表的中间结点）
    //这样找到的slow是中间节点左边的那个
    private ListNode middleNode(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode slow = head;
        ListNode fast = head.next.next;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // 合并两个有序链表（21. 合并两个有序链表）
    private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newHead = new ListNode(0);
        ListNode cur  = newHead;
        while (l1 != null && l2 != null){
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
        else cur.next = l1;
        return newHead.next;
    }

}
