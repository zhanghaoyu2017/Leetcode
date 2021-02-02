package com.hiasenna.tencent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @ClassName B
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/23-20:20
 * @Version 1.0
 **/
public class B {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        int k = s.nextInt();
        List<String> list = new ArrayList<>();
        for (int i = 0;i<str.length();i++){
            for (int j = i;j<str.length();j++){
                String temp = str.substring(i,j+1);
                if (!list.contains(temp)){
                    list.add(temp);
                }
            }
        }
        Collections.sort(list);
        System.out.println(list.get(k-1));
    }
}
