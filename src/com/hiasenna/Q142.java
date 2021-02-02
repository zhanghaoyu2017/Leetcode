package com.hiasenna;

/**
 * @ClassName Q142
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/9/16-17:51
 * @Version 1.0
 **/
public class Q142 {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (true){
            if (fast == null || fast.next == null) return null;
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) break;
        }
        slow = head;
        while (slow!=fast){
            slow =slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
