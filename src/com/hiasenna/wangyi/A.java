package com.hiasenna.wangyi;


import java.util.Scanner;

/**
 * @ClassName A
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/9/12-15:40
 * @Version 1.0
 **/
public class A {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        String[] c = a.split(" ");
        int m = Integer.valueOf(c[0]);
        int n = Integer.valueOf(c[1]);
        int[][][] ans = new int[n][2][n];
        TreeNode root = new TreeNode(1);
        for (int i = 0; i < n; i++) {
//            String tmp = s.nextLine();
//            String[] arr = tmp.split(" ");
//            int father = Integer.valueOf(arr[0]);
//            String child = arr[1];
//            int value = Integer.valueOf(arr[2]);
//            setTree(root, father, child, value);

        }
        int res = result(root, 0);
        System.out.println(res);
    }

    public static TreeNode setTree(TreeNode root, int father, String child, int value) {
        TreeNode fnode = find(father, root);
        TreeNode node = new TreeNode(value);
        if (child.equals("left")) {
            fnode.left = node;
        } else {
            fnode.right = node;
        }
        return root;
    }

    public static int result(TreeNode node, int res) {

        if (node.left != null) result(node.left, res);
        if (node.right != null) result(node.right, res);
        if (node.left == null && node.right == null) {
            res++;
        }
        return res;
    }


    public static TreeNode find(int value, TreeNode root) {
        if (root.val == value) return root;
        if (root.left != null) find(value, root.left);
        if (root.right != null) find(value, root.right);
        return null;
    }

}
//10 9
//        1 left 2
//        1 right 3
//        2 left 4
//        2 right 5
//        3 right 6
//        6 left 7
//        6 right 8
//        7 left 9
//        7 right 10