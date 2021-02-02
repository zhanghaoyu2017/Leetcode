package com.hiasenna;

/**
 * @ClassName Q100
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/7-7:48
 * @Version 1.0
 **/
public class Q100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // 都为空的话，显然相同
        if (p == null && q == null) return true;
        // 一个为空，一个非空，显然不同
        if (p == null || q == null) return false;
        // 两个都非空，但 val 不一样也不行
        if (p.val != q.val) return false;

        // root1 和 root2 该比的都比完了
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);

    }

    public boolean isSameTree2(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (q.val != p.val) return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
