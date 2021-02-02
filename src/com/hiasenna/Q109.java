package com.hiasenna;

import java.util.List;

/**
 * @ClassName Q109
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/18-9:49
 * @Version 1.0
 **/
public class Q109 {

    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return new TreeNode(head.val);
        ListNode slow = head, fast = head, pre = null;
        while (fast != null && fast.next != null) {
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        pre.next = null;
        TreeNode node = new TreeNode(slow.val);
        node.left = sortedListToBST(head);
        node.right = sortedListToBST(slow.next);
        return node;
    }
}
