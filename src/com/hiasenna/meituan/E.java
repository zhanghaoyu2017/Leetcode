package com.hiasenna.meituan;


import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName E
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/8-17:20
 * @Version 1.0
 **/
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    int color; // 颜色 为0表示黄色，为1表示黑色。

    TreeNode(int x) {
        val = x;
    }
}

public class E {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] color = new int[n];
        int[] notes = new int[n];
        int res[] = new int[n];//结果集
        for (int i = 0; i < n; i++) {
            color[i] = s.nextInt();
        }
        for (int i = 0; i < n-1; i++) {
            notes[i] = s.nextInt();
        }
        TreeNode root = new TreeNode(1); //根节点
        root.color = color[0];
        for (int i = 1; i < n; i++) {
            TreeNode node = new TreeNode(i + 1);
            node.color = color[i];
            addNote(notes[i], node, root);
        }
        //计算不同颜色的深度和
        for (int i = 0; i < n; i++) {
            res[i] = culDepth(i+1,root);
            System.out.println(res[i]);
        }


    }

    //建树
    public static void addNote(int father, TreeNode node, TreeNode root) {
        if (root.val == father) {
            //找到了父节点
            if (root.left == null) {
                root.left = node;
                return;
            } else if (root.right == null) {
                root.right = node;
                return;
            }
        } else if (root.left != null) {
            addNote(father, node, root.left);
        } else if (root.right != null) {
            addNote(father, node, root.right);
        }

    }
    //遍历树找到相应的note
    public static TreeNode findNote( int val, TreeNode root) {
        TreeNode node  = root;
        if (val == node.val) return node;
        else if (node.left != null) {
            return findNote(val, node.left);
        } else if (node.right != null) {
            return findNote(val, node.right);
        }
        return node;
    }
    public static int culDepth( int val, TreeNode root) {
        int res = 1;
        TreeNode node = findNote(val,root) ;

        if (root.color != node.color){
            res += depth(node);
        } else if (root.left != null) {
            res += culDepth(val, node.left);
        } else if (root.right != null) {
            res += culDepth(val, node.right);
        }
        return res;
    }
    //计算深度
    public static int depth( TreeNode root) {
        if(root == null) return 0;
        return Math.max(depth(root.left), depth(root.right)) + 1;
    }
}
