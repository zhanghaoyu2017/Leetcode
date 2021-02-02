package com.hiasenna.xiecheng;

import java.util.*;

/**
 * @ClassName A
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/15-19:02
 * @Version 1.0
 **/
public class A {
    static int[] divingBoard(int a, int b, int k) {
        List<Integer> res = new ArrayList<>();
        int max = 0;
        int min = 0;
        for (int i = 0; i < k; i++) {
            max += Math.max(a, b);
            min += Math.min(a, b);
        }
        res.add(min);
        res.add(max);
        for (int i = min;i<max;i++){
//            if (i % a ==0 || i % b ==0) {
                if (!res.contains(i))
                res.add(i);
//            }
        }
        Collections.sort(res);
        int[] res2 = new int[res.size()];
        for (int i = 0;i<res.size();i++){
            res2[i] = res.get(i);
        }
        return res2;


    }

    /******************************结束写代码******************************/


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] res;

        int _a;
        _a = Integer.parseInt(in.nextLine().trim());

        int _b;
        _b = Integer.parseInt(in.nextLine().trim());

        int _k;
        _k = Integer.parseInt(in.nextLine().trim());

        res = divingBoard(_a, _b, _k);
        String value = "[]";
        if (res != null && res.length > 0) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < res.length; i++) {
                if (i == 0) {
                    stringBuilder.append("[");
                }
                stringBuilder.append(res[i]);
                if (i == res.length - 1) {
                    stringBuilder.append("]");
                } else {
                    stringBuilder.append(",");
                }
            }
            value = stringBuilder.toString();
        }
        System.out.println(value);
    }
}
