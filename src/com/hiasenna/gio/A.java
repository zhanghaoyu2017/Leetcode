package com.hiasenna.gio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @ClassName A
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/30-10:07
 * @Version 1.0
 **/
public class A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while (s.hasNextInt()){
            int t = s.nextInt();
            list.add(t);
        }
        int res = 1;
        for (int i = 0;i<list.size();i++){
            int tmp = 1;
            for (int j = i+1;j<list.size();j++){
                if (list.get(j)>list.get(j-1)){
                    tmp++;
                }
            }
            res = Math.max(tmp,res);
        }
        System.out.println(res);
    }
}
