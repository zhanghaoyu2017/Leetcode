package com.hiasenna.baidu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @ClassName A
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/9/3-19:47
 * @Version 1.0
 **/
public class A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        int five = 0;
        int zero = 0;
        for (int i = 0; i < n; i++) {
            int tmp = s.nextInt();
            arr[i] = tmp;
            if (tmp == 5) {
                five++;
            } else if (tmp == 0) {
                zero++;
            }
        }
        List<Long> res = new ArrayList<>();
        dfs(res, new String(""), five, zero, n);
        if (res.size()!=0){
            long max = -1;
            for (int i = 0; i < res.size(); i++) {
                max = Math.max(max, res.get(i));
            }

            System.out.println(max);
        }else {
            System.out.println(-1);
        }

    }

    static void dfs(List<Long> res, String chain, int five, int zero, int size) {
        if (chain.length() == size) {
            long num = Long.valueOf(chain);
            if (num % 90 == 0) {
                if (!res.contains(num)) {
                    res.add(num);
                }
            }
        }

        if (five != 0) {
            chain += "5";
            dfs(res, chain, five - 1, zero, size);
//            chain = chain.substring(0, chain.length() - 1);
        }
        if (zero != 0) {
            chain += "0";
            dfs(res, chain, five, zero - 1, size);
//            chain = chain.substring(0, chain.length() - 1);
        }
    }

}
