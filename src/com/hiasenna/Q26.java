package com.hiasenna;

/**
 * @ClassName Q26
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/7/28-15:52
 * @Version 1.0
 **/
public class Q26 {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,2,2,3,3,4,4};
        System.out.println(removeDuplicates(arr));
    }
    public static  int removeDuplicates(int[] nums) {

        int n = nums.length;
        if (n==0 || nums==null) return 0;
        int j = 0;
        for (int i =1;i<n;i++){
            if (nums[j] !=nums[i]){
                j++;
                nums[j]  = nums[i];
            }
        }
        return j+1;
    }
}
