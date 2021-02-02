package com.hiasenna;

/**
 * @ClassName Q167
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/7/20-8:05
 * @Version 1.0
 **/
public class Q167 {
    public static void main(String[] args) {
        int[] numbers = {2,3,4};
        int[] res  = twoSum(numbers,6);
        System.out.println(res[0]+"========"+res[1]);
    }

    public static int[] twoSum(int[] numbers, int target) {
        int res1 = 0;
        int res2 = 0;
        int[] res  = new int[2];
        for (int i = 0; i < numbers.length ; i++) {
            for (int j = i + 1; j < numbers.length ; j++) {
                if (numbers[i] + numbers[j] == target) {
                    res1 = i+1;
                    res2 = j+1;
                    break;
                }
            }
        }

        res[0] = res1;
        res[1] = res2;
        return res;

    }
    //时间O(n) 空间O(1)
    public static int[] twoSum2(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length-1;
        while (low < high){
            int sum = numbers[low] + numbers[high];
            if (sum == target){
                return new int[]{low+1,high+1};
            }else if (sum <target){
                ++low;
             }else {
                --high;
            }
        }
        return new int[]{-1,-1};
    }
}
