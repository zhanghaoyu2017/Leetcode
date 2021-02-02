package com.hiasenna;

/**
 * @ClassName Q200_dfs
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/19-12:13
 * @Version 1.0
 **/
public class Q200_dfs {
    public int numIslands(char[][] grid) {
        if (grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    dfs(i,j,grid);
                    res++;
                }
            }
        }
        return res;

    }

    void dfs(int i, int j, char[][] grid) {
        //1.截止条件
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] != '1') {
            return;
        }
        grid[i][j] = '2';
        dfs(i - 1, j, grid);//上
        dfs(i + 1, j, grid);//下
        dfs(i, j - 1, grid);//左
        dfs(i, j + 1, grid);//右
    }
}
