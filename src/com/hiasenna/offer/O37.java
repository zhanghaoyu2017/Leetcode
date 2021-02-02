package com.hiasenna.offer;

/**
 * @ClassName O37
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/7/27-16:43
 * @Version 1.0
 **/
public class O37 {
//原理：我们可以根据前序遍历的顺序来序列化二叉树,因为前序遍历是从根节点开始的。在遍历二叉树碰到 null时,将其序列化为一个特殊的字符(如'$')
//另外,节点的数值之间要用一个特殊字符(如',')隔开,因为节点的值位数不定且正负不定。
//则下面二叉树      1               可以序列化为：
//				 /  \              [1,2,4,$,$,$,3,5,$,$,6,$,$]
//				2    3
//             /    / \
//            4    5   6
//我们接着以上述字符串为例分析如何反序列化二叉树。第一个读出的数字是1。由于前序遍历是从根节点开始的,这是根节点的值。
//接下来读出的数字是2,根据前序遍历的规则,这是根节点的左子节点的值。同样,接下来的数字4是值为2的节点的左子节点。
//接着从字符串里读出两个字符'$',这表明值为4的节点的左、右子节点均不存在,因此它是一个叶节点。接下来回到值为2的节点,重建它的右子节点。
//由于下一个字符是'$',这表明值为2的节点的右子节点不存在， 2这个节点的左、右子树都己经构建完毕,接下来回到根节点,反序列化根节点的右子树
//下一个序列化字符串中的数字是3,因此右子树的根节点的值为3。它的左子节点是一个值为5的叶节点,因为接下来的三个字符是"5,$,$"。
//同样,它的右子节点是值为6的叶节点,因为最后3个字符是"6,$,$"。

    int start = 0;//注意这里必须是全局变量，否则后面的迭代过程中start无法正确变化

    public String serialize(TreeNode root) {
        if (root == null) return "$";
        StringBuilder res = new StringBuilder();
        recur(root, res);
        return res.toString();
    }

    public void recur(TreeNode root, StringBuilder res) {//前序遍历
        if (root == null) {
            res.append("$,");//可以append string
            return;
        }
        res.append(root.val);//append int 由于int位数不定，且可正可负，因此各元素间必须用,分割
        res.append(',');//append char
        recur(root.left, res);
        recur(root.right, res);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data.equals("$")) return null;//Sting值相等的判别不能用==
        String inputs[] = data.split(",");
        //虽然data中以,结尾，但是上述分割后会默认最后一个,不存在  不会使最后一个分割元素为空
        return build(inputs);
    }

    public TreeNode build(String[] inputs) {
        TreeNode res;
        if (inputs[start].equals("$")) {
            start++;
            return null;//这里说明当前节点为null，自然不存在左右节点了，直接返回
        }
        res = new TreeNode(Integer.parseInt(inputs[start]));
        start++;
        //注意：start不能以形参的形式引入build方法中，build(inputs,start);如果是这样
        //下面res.left = build(inputs,start); res.right = build(inputs,start+1);由于处于同一级迭代中start值连续
        //但实际上res.right中应该是上面res.left迭代完成后才会执行的，start不连续，因此把start作为全局变量较为合适
        res.left = build(inputs);
        res.right = build(inputs);
        return res;
    }
}

/**
 * Definition for a binary tree node.
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
