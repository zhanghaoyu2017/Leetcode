package com.hiasenna.test;

import java.util.ArrayList;

public class Main15 {

    // 8
    public static final int[][] dataset1 = {
            {0, 0, 0, 0, 0},
            {1, 0, 1, 0, 0},
            {0, 0, 0, 1, 0},
            {0, 1, 1, 0, 0},
            {0, 0, 0, 0, 0}
    };
    // 12
    public static final int[][] dataset2 = {
            {0, 0, 0, 0, 0},
            {0, 1, 1, 1, 0},
            {0, 1, 0, 0, 0},
            {0, 1, 0, 1, 1},
            {0, 1, 0, 0, 0}
    };
    // -1
    public static final int[][] dataset3 = {
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 1},
            {0, 0, 0, 0, 0, 0, 1, 0},

    };

    // 24
    public static final int[][] dataset4 = {
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 1},
            {0, 0, 0, 0, 0, 1, 1, 0},
            {0, 0, 0, 0, 1, 0, 0, 0},
            {0, 0, 0, 1, 0, 0, 1, 0},
            {0, 0, 1, 0, 0, 1, 0, 0},
            {0, 1, 0, 0, 1, 0, 0, 1},
            {0, 0, 0, 1, 0, 0, 0, 0},
    };

    public static void main(String[] args) {
        Main15 instance = new Main15();
        instance.calculateMinStep(dataset1);
        instance.calculateMinStep(dataset2);
        instance.calculateMinStep(dataset3);
        instance.calculateMinStep(dataset4);
    }

    public void calculateMinStep(int [][]map){
        // always start at (0,0) goto (x,x) where x is side length - 1
        // 4 direction move(up down left right), one move +1 step
        // map:0 = road,1 = block,
        // print minimum step to get out
        // if cant get out, print -1
        int width = map[0].length;
        int height = map.length;

        System.out.println(0);
    }
    //第一个表 Order id uid price
    //第二张表 User id name sex
    //筛选出 name 总price 女

    // select  a.name,a.tp from User u
    // left join
    //(select uid, name, count(price) tp,sex from Order where sex ='女' group by uid order by count(price) desc) a
    // on u.id = a.uid and limit 10 ;


}
