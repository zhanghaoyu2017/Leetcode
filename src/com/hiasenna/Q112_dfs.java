package com.hiasenna;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Q112_dfs
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/19-11:43
 * @Version 1.0
 **/
public class Q112_dfs {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        //1.截止条件
        if (root.left == null && root.right == null) {
            if (sum == root.val) return true;
        }
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);

    }
}
