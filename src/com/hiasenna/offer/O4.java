package com.hiasenna.offer;

/**
 * @ClassName O4
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/7/26-16:11
 * @Version 1.0
 **/
public class O4 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int m = matrix.length;
        if (m == 0 || matrix == null) return false;
        int n = matrix[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j]==target) return true;
                if (matrix[i][j] >target) break;
            }
        }
        return false;
    }
    public boolean findNumberIn2DArray2(int[][] matrix, int target) {
        if(matrix.length > 0 && matrix[0].length >0){
            int hang = 0;
            int lie = matrix[0].length - 1;
            while (lie>= 0 && hang < matrix.length) {
                if (matrix[hang][lie] == target) {
                    return true;
                }
                if (matrix[hang][lie] > target) {
                    lie -= 1;
                } else {
                    hang += 1;
                }
            }
        }
        return false;
    }
}
