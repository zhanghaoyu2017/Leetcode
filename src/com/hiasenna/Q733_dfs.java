package com.hiasenna;

/**
 * @ClassName Q733_dfs
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/21-22:25
 * @Version 1.0
 **/
public class Q733_dfs {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int oldColor = image[sr][sc];
        if (newColor == oldColor) return image;
        dfs(image,sr,sc,newColor,oldColor);
        return image;
    }

    void dfs(int[][] image, int sr, int sc, int newColor,int oldColor) {
        if (sc < 0 || sr < 0 || sr > image.length-1||sc > image[0].length-1|| image[sr][sc] != oldColor){
            return;
        }
        image[sr][sc]  = newColor;
        dfs(image,sr-1,sc,newColor,oldColor);
        dfs(image,sr,sc+1,newColor,oldColor);
        dfs(image,sr+1,sc,newColor,oldColor);
        dfs(image,sr,sc-1,newColor,oldColor);
    }

}
