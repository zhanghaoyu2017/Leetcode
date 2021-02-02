package com.hiasenna.sanliuling;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @ClassName A
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/22-19:41
 * @Version 1.0
 **/
public class A {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int res = 0;
        List<String> list = new ArrayList<>();
        for (int i = 0;i<n;i++){
            list.add(s.next());
        }
        for (int i =0;i<list.size();i++){
            String cur = list.get(i);
            if (cur.length()<=10){
                boolean flag = true;
                for(int j = 0;j<cur.length();j++){
                    if ((cur.charAt(j) >='A' && cur.charAt(j)<= 'Z')||(cur.charAt(j) >='a' && cur.charAt(j)<= 'z')){
                        continue;
                    }else {
                        flag = false;
                        break;
                    }
                }
                if (flag) res++;
            }
        }
        System.out.println(res);
    }
}
