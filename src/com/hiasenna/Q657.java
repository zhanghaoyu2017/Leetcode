package com.hiasenna;

/**
 * @ClassName Q657
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/28-22:25
 * @Version 1.0
 **/
public class Q657 {
    public static void main(String[] args) {
        System.out.println(judgeCircle("DURDLDRRLL"));
    }
    public static boolean judgeCircle(String moves) {
        int[] res = new int[2];
        res[0] = 0;
        res[1] = 0;
        for (int i = 0; i < moves.length(); i++) {
            char step = moves.charAt(i);
            if (step == 'R') {
                res[1]++;
            } else if (step == 'L') {
                res[1]--;
            } else if (step == 'U') {
                res[0]++;
            } else if (step == 'D') {
                res[0]--;
            }
        }
        if (res[0] == 0 && res[1] == 0) {
            return true;
        } else {
            return false;
        }

    }
    public static boolean judgeCircle2(String moves) {
       int x = 0;
       int y = 0;
        for (int i = 0; i < moves.length(); i++) {
            char step = moves.charAt(i);
            if (step == 'R') {
                y++;
            } else if (step == 'L') {
                y--;
            } else if (step == 'U') {
                x++;
            } else if (step == 'D') {
                x--;
            }
        }
        if (x == 0 && y == 0) {
            return true;
        } else {
            return false;
        }

    }
}
