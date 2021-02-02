package com.hiasenna;

/**
 * @ClassName Q206
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/17-15:57
 * @Version 1.0
 **/
public class Q206 {
    public ListNode reverseList(ListNode head) {
        ListNode cur = head;
        ListNode next = null;
        ListNode reverseHead = null;
        while(cur != null){
            next = cur.next;
            cur.next = reverseHead;
            reverseHead = cur;
            cur = next;
        }
        return  reverseHead;
    }

    public ListNode reverseList2(ListNode head) {
        ListNode cur = head;
        ListNode pre = null;
        while (cur != null){
            ListNode tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        return cur;
    }
}
