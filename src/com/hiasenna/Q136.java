package com.hiasenna;

/**
 * @ClassName Q136
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/7/30-10:25
 * @Version 1.0
 **/
public class Q136 {
    public int singleNumber(int[] nums) {
//        任何数和 0做异或运算，结果仍然是原来的数，即 a⊕0=a。
//        任何数和其自身做异或运算，结果是 0，即  a⊕a=0。
//        异或运算满足交换律和结合律，即 a⊕b⊕a=b⊕a⊕a=b⊕(a⊕a)=b⊕0=b。

        int n = nums.length;
        int res = 0;
        for (int i =0;i<n;i++){
            res ^= nums[i];
        }

        return res;
    }
}
