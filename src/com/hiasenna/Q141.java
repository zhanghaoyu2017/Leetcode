package com.hiasenna;

/**
 * @ClassName Q141
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/5-16:10
 * @Version 1.0
 **/
public class Q141 {

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != slow) {
            if (fast == null || fast.next == null) return false;
            slow = slow.next;
            fast = fast.next.next;

        }
        return true;
    }
}
