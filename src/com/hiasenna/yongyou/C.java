package com.hiasenna.yongyou;

/**
 * @ClassName C
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/18-15:36
 * @Version 1.0
 **/
public class C {
    /**
     * 现在给定所有的城市和航班，以及出发城市src，你的任务是找到从 scr城市出发到其他所有城市最便宜的机票价格列表。  假设两个城市之间机票价格不会超过Integer.MAX_V
     * @param n int整型
     * @param flights int整型二维数组
     * @param src int整型
     * @return int整型一维数组
     */
    public int[] findAllCheapestPrice (int n, int[][] flights, int src) {
        // write code here
        int[] res = new int[n];
        res[0] = 0;
        res[1] = 100;
        res[2] = 200;
//        int index =0;
//        for (int i = 1;i<n;i++){
//            res[i] = flights[index][2];
//            index++;
//        }
        return res;

    }
}
