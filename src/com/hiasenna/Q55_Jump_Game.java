package com.hiasenna;

import java.util.Arrays;

/**
 * @ClassName Q55_Jump_Game
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/7/20-16:18
 * @Version 1.0
 **/
public class Q55_Jump_Game {
    public static void main(String[] args) {

    }

    //存在性动态规划
    public static boolean canJump(int[] nums) {
        //确定状态  跳到最后一块
        //j+nums[j] > i
        boolean[] dp = new boolean[nums.length];
        Arrays.fill(dp,false);
        dp[0] = true;
        for (int i = 1;i<nums.length;i++){
            for (int j =0;j<i;j++){
                if (dp[j] && j+nums[j] >= i){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[nums.length-1];

    }
}
