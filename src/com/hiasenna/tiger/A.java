package com.hiasenna.tiger;

/**
 * @ClassName A
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/23-16:54
 * @Version 1.0
 **/
public class A {
    /**
     * 排队
     *
     * @param head ListNode类 头结点
     * @return ListNode类
     */
    public static ListNode lineUp(ListNode head) {
        // write code here
        ListNode node1;
        ListNode node2;
        node1 = head;
        node2 = head.next;
        ListNode tmp1 = node1;
        ListNode tmp2 = node2;
        while (tmp1.next != null && tmp2.next != null) {
            if (tmp1.next.next!=null){
                tmp1.next = tmp1.next.next;
                tmp1 = tmp1.next;

            }
            if (tmp2.next.next!=null){
                tmp2.next = tmp2.next.next;
                tmp2 = tmp2.next;
            }
        }
        tmp2.next = null;
        ListNode temp = node1;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node2;
        return node1;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(1);
        ListNode node4 = new ListNode(5);
        ListNode node5 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        ListNode res = lineUp(node1);
        while (res!=null){
            System.out.println(res.val);
            res = res.next;
        }
    }
}

class ListNode {
    int val;
    ListNode next = null;
    ListNode(int val){
        this.val = val;
    }
}