package com.hiasenna.glodon;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @ClassName A
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/7/29-19:04
 * @Version 1.0
 **/
public class A {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;//小草的个数
        int m;//魔法药剂的个数
        int x;//每瓶魔法药剂让小草长高的高度
        n = s.nextInt();
        m = s.nextInt();
        x = s.nextInt();
        PriorityQueue<Integer> grass = new PriorityQueue<>(n);
//        int[] grass = new int[n];
        for (int i = 0;i<n;i++){
            grass.add(s.nextInt());
//            grass[i] = s.nextInt();
        }
        for (int i = 0;i<m;i++){
//            Arrays.sort(grass);
//            grass[0] = grass[0] + x;
            int tmp = grass.poll();
            grass.add(tmp+x);
        }

        System.out.println(grass.peek());
    }
}
