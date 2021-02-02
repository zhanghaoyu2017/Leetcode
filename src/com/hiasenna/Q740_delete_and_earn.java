package com.hiasenna;

/**
 * @ClassName Q740_delete_and_earn
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/7/25-22:22
 * @Version 1.0
 **/
public class Q740_delete_and_earn {
    public int deleteAndEarn(int[] nums) {
        int n = nums.length;
        if (n == 0 || nums == null) return 0;
        if (n==1) return nums[0];
        int max = nums[0];
        for (int i =0;i<n;i++){
            max = Math.max(max,nums[i]);
        }
        //构造一个新的数组
        int[] all = new int[1];
        return 1;
    }

    public int countOdds(int low, int high) {
        if(low % 2 ==0){
            if(high %2 ==0) return (high - low)/2;
            else return (high-1 - low) / 2;
        }else{
            if(high %2 ==0) return (high-1 - low) / 2;
            else  return (high - low) / 2;
        }

    }
}
