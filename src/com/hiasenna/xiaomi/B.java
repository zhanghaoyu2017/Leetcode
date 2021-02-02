package com.hiasenna.xiaomi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * @ClassName B
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/9/15-19:38
 * @Version 1.0
 **/
public class B {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        List<String> list = new ArrayList<>();
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            String tmp = str.charAt(i) + "";
            if (!list.contains(tmp)){
                list.add(tmp);
                res += tmp;
            }
        }
        System.out.println(res);
    }
}
