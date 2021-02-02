package com.hiasenna.duxiaoman;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @ClassName A
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/9/20-19:57
 * @Version 1.0
 **/
public class A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str1 = s.next();
        String str2 = s.next();
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0;i<str1.length();i++){
            String tmp = str1.charAt(i)+"";
            if (map.containsKey(tmp)){
                map.put(tmp,map.get(tmp)+1);
            }else {
                map.put(tmp,1);
            }
        }
        int res = 0;
        for (int i =0;i<str2.length();i++){
            String tmp = str2.charAt(i)+"";
            if (map.containsKey(tmp)&& map.get(tmp)>0){
                res++;
                map.put(tmp,map.get(tmp)-1);
            }
        }
        System.out.println(res);
    }
}
