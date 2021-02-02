package com.hiasenna;

/**
 * @ClassName Q258
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/7/27-22:35
 * @Version 1.0
 **/
public class Q258 {
    public int addDigits(int num) {
        if (num==0)return 0;
        if (num %9==0) return 9;
        else return num %9;



    }
}
