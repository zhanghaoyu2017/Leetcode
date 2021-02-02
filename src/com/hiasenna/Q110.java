package com.hiasenna;

/**
 * @ClassName Q110
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/17-11:44
 * @Version 1.0
 **/
public class Q110 {
    public static void main(String[] args) {
        int a = -128;
        Integer b = -128;
        Integer c = Integer.valueOf(-128);
        Integer d = new Integer(-128);

        System.out.println(a == b);//t
        System.out.println(a == c);//t
        System.out.println(a == d);//t
        System.out.println(b == c);//t
        System.out.println(d == b);//f
        System.out.println(c == d);//f
    }

    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        int left = calDepth(root.left);
        int right = calDepth(root.right);
        if (Math.abs(left - right) <= 1 && isBalanced(root.left) && isBalanced(root.right)) {
            return true;
        } else {
            return false;
        }
    }

    int calDepth(TreeNode node) {
        if (node == null) return 0;
        int left = calDepth(node.left);
        int right = calDepth(node.right);
        return Math.max(left, right) + 1;
    }
}
