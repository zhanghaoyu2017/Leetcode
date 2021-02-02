package com.hiasenna;

/**
 * @ClassName Q54_Spiral_Matrix
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/7/22-10:12
 * @Version 1.0
 **/
public class Q54_Spiral_Matrix {



    public static int[] spiralOrder(int[][] matrix) {
        int m = matrix.length;
        if (m==0){
            return new int[]{};
        }
        int n = matrix[0].length;
        int top = 0;
        int bottom = m-1;
        int left = 0;
        int right = n-1; //设置上下左右界限
        int count = 0;
        int[] res = new int[m*n];
        while (top<=bottom && left<=right){
            for (int i = left;i<=right;i++){ //从左到右
                if (count==res.length) break;
                res[count] = matrix[top][i];
                count++;
            }
            top++;
            //从上到下

            for (int i = top;i<=bottom;i++){
                if (count==res.length) break;
                res[count] = matrix[i][right];
                count++;
            }
            right--;
            //从右到左
            for (int j = right;j>=left && top<=bottom;j--){
                if (count==res.length) break;
                res[count] = matrix[bottom][j];
                count++;
            }
            bottom--;
            //从下到上
            for (int i = bottom;i>=top && left<=right;i--){
                if (count==res.length) break;
                res[count] = matrix[i][left];
                count++;
            }
            left++;
        }
        return res;

    }
}
