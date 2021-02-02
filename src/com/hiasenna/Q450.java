package com.hiasenna;

/**
 * @ClassName Q450
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/8-11:27
 * @Version 1.0
 **/
public class Q450 {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;
        if (root.val == key) {
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;

            //
            TreeNode minNode = getMinNode(root.right);
            root.val = minNode.val;
            root.right = deleteNode(root.right, minNode.val);
        } else if (root.val > key) {
            root.left = deleteNode(root.left, key);
        } else if (root.val < key) {
            root.right = deleteNode(root.right, key);
        }
        return root;
    }

    //二叉搜索树性质
    private TreeNode getMinNode(TreeNode node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    public TreeNode deleteNode2(TreeNode root, int key) {
        if(root == null){
            return null;
        }
        //当前节点值比key小，则需要删除当前节点的左子树中key对应的值，并保证二叉搜索树的性质不变
        if(key < root.val){
            root.left = deleteNode(root.left,key);
        }
        //当前节点值比key大，则需要删除当前节点的右子树中key对应的值，并保证二叉搜索树的性质不变
        else if(key > root.val){
            root.right = deleteNode(root.right,key);
        }
        //当前节点等于key，则需要删除当前节点，并保证二叉搜索树的性质不变
        else{
            //当前节点没有左子树
            if(root.left == null){
                return root.right;
            }
            //当前节点没有右子树
            else if(root.right == null){
                return root.left;
            }
            //当前节点既有左子树又有右子树
            else{
                TreeNode node = root.right;
                //找到当前节点右子树最左边的叶子结点
                while(node.left != null){
                    node = node.left;
                }
                //将root的左子树放到root的右子树的最下面的左叶子节点的左子树上
                node.left = root.left;
                return root.right;
            }
        }
        return root;
    }

}
