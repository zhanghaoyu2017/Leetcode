package com.hiasenna.yongyou;

/**
 * @ClassName B
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/18-15:22
 * @Version 1.0
 **/
public class B {
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] res = convert(a);
        System.out.println(res.length);
        System.out.println(res[0].length);
        for (int i = 0;i<res.length;i++){
            for (int j = 0;j<res[0].length;j++){
                System.out.println(res[i][j]);
            }
        }
    }
    public static int[][] convert(int[][] matrix) {
        // write code here
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] res = new int[m][n];
        int c = 0;
        for (int i = m-1; i >=0; i--) {
            for (int j = 0;j<n;j++){
                res[c][j] = matrix[i][j];
            }
            c++;
        }
        return res;
    }
}