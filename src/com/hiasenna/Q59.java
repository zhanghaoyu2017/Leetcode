package com.hiasenna;

/**
 * @ClassName Q59
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/1-10:48
 * @Version 1.0
 **/
public class Q59 {

    public int[][] generateMatrix(int n) {
        int m = n * n;
        int left = 0;
        int right = n-1;
        int top = 0;
        int bottom = n-1;

        int[][] res = new int[n][n];
        int num = 1;
        while (num <= m){
            for (int i =left;i<=right;i++){
                res[top][i] = num;
                num++;
            }
            top++;
            for(int i = top;i<=bottom;i++){
                res[i][right] = num;
                num++;
            }
            right--;
            for (int i = right ; i>=left;i--){
                res[bottom][i] = num;
                num++;
            }
            bottom--;
            for (int i = bottom;i>=top;i--){
                res[i][left] = num;
                num++;
            }
            left++;
        }
        return res;
    }
}
