package com.hiasenna;

/**
 * @ClassName Q130_dfs
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/21-22:55
 * @Version 1.0
 **/
public class Q130_dfs {
    int m, n;

    public void solve(char[][] board) {
        n = board.length;
        if (n == 0) return;
        m = board[0].length;
        for (int i = 0; i < n; i++) {
            dfs(board, i, 0);
            dfs(board, i, m - 1);
        }
        for (int i = 0; i < m; i++) {
            dfs(board, 0, i);
            dfs(board, n - 1, i);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] =='A'){
                    board[i][j] ='O';
                }else if (board[i][j] == 'O'){
                    board[i][j] = 'X';
                }
            }
        }
    }

    void dfs(char[][] board, int x, int y) {
        if (x < 0 || y < 0 || x >= n || y >= m || board[x][y] != 'O') {
            return;
        }
        board[x][y] = 'A';
        dfs(board, x + 1, y);
        dfs(board, x, y + 1);
        dfs(board, x - 1, y);
        dfs(board, x, y - 1);

    }


}
