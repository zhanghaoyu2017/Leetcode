package com.hiasenna;

/**
 * @ClassName O12_dfs
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/19-16:56
 * @Version 1.0
 **/
public class O12_dfs {
    public boolean exist(char[][] board, String word) {
        char[] str = word.toCharArray();
        boolean[] res = new boolean[1];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == str[0]){
                    dfs(res,board,i,j,str,0);
                    if (res[0]){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    void dfs(boolean[] res,char[][] board,int i,int j,char[] str,int index){
        //截止条件
        if(res[0]||index == str.length){
            res[0] = true;
            return;
        }
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] != str[index]) {
            return;
        }
        char tmp = board[i][j];

        if (board[i][j] == str[index]){
            board[i][j] = '&';
            dfs(res,board,i-1,j,str,index+1);
            dfs(res,board,i+1,j,str,index+1);
            dfs(res,board,i,j-1,str,index+1);
            dfs(res,board,i,j+1,str,index+1);
            board[i][j] = tmp;
        }
    }
}
