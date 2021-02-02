package com.hiasenna.sanliuling;

import org.omg.CORBA.MARSHAL;

import java.util.*;

/**
 * @ClassName E
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/24-13:56
 * @Version 1.0
 **/
public class E {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        long[][] game = new long[n][2];
        long res = 0;
        for (int i = 0; i < n; i++) {
            int a = s.nextInt();
            int b = s.nextInt();
            game[i][0] = a;
            game[i][1] = b;
        }
//        //首先选择没宝藏的关卡；
        List<Long> bz = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (game[i][1] == 0) {
                res += game[i][0];
            }
            if (game[i][1] == 1) {
                bz.add(game[i][0]);
            }
        }
        Collections.sort(bz);
        for (int i = bz.size() - 1; i >= 0; i--) {
            res = Math.max((res + bz.get(i)), res * 2);
        }
        System.out.println(res);

    }
}
