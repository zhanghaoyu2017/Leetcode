package com.hiasenna.xunfei;

import java.util.Scanner;

/**
 * @ClassName D
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/7/31-14:53
 * @Version 1.0
 **/
public class D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
//        char[] c = s.toCharArray();
        String ans = "";
        for ( int i =0;i<s.length();i++){
            Character c = s.charAt(i);
            if (c <= '9' && c >= '0' ){
                ans += c;
            }
        }
        if (s.charAt(0) == '-') ans = '-'+ans;
        System.out.println(Long.valueOf(ans));
    }
}
