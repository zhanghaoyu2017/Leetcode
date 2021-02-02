package com.hiasenna;

/**
 * @ClassName Q529_dfs
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/20-10:15
 * @Version 1.0
 **/
public class Q529_dfs {
    int[] dirX = {-1, -1, -1, 0, 0, 1, 1, 1};
    int[] dirY = {-1, 0, 1, -1, 1, -1, 0, 1};

    public char[][] updateBoard(char[][] board, int[] click) {
        int x = click[0];
        int y = click[1];

        if (board[x][y] == 'M') {
            //规则一
            board[x][y] = 'X';
        } else {
            dfs(board,x,y);
        }
        return board;
    }

    void dfs(char[][] board, int x, int y) {
        int count = 0;
        for (int i = 0; i < 8; i++) {
            //遍历周围八个方向
            int tx = x + dirX[i];
            int ty = y + dirY[i];
            if (tx < 0 || tx >= board.length || ty < 0 || ty >= board[0].length){
                continue;
            }
            //判断周围地雷
            if (board[tx][ty] == 'M'){
                count++;
            }
        }
        if (count > 0){
            //规则三
            board[x][y] = (char) (count+'0');
        }else {
            //规则二
            board[x][y] = 'B';
            for (int i = 0;i< 8 ;i++){
                int tx = x + dirX[i];
                int ty = y + dirY[i];
                // 这里不需要在存在 B 的时候继续扩展，因为 B 之前被点击的时候已经被扩展过了
                if (tx < 0 || tx >= board.length || ty < 0 || ty >= board[0].length || board[tx][ty] != 'E') {
                    continue;
                }
                dfs(board, tx, ty);
            }
        }
    }

}
