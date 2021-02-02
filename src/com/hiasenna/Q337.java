package com.hiasenna;

/**
 * @ClassName Q337
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/5-9:16
 * @Version 1.0
 **/
public class Q337 {
    public int rob(TreeNode root) {
        if (root == null) return 0;
        int[] result = robInternal(root);
        return Math.max(result[0], result[1]);
    }

    /**
     * 返回一个大小为 2 的数组 arr
     * arr[0] 表示不抢 root 的话，得到的最大钱数
     * arr[1] 表示抢 root 的话，得到的最大钱数
     **/
    public int[] robInternal(TreeNode root) {
        if(root == null) return new int[2];
        int[] result = new int[2];
        int[] left = robInternal(root.left);
        int[] right = robInternal(root.right);

        //这家抢，下家就不能抢了
        int rob = root.val+left[0]+right[0];
        //这家不抢的话 下家可以抢 可以不抢 取决于收益
        int no_rob = Math.max(left[0],left[1])+Math.max(right[0],right[1]);

        result[1] = rob;
        result[0] = no_rob;
        return result;
    }
}
