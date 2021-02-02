package com.hiasenna.beike;

import java.util.Scanner;

/**
 * @ClassName A
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/11-18:59
 * @Version 1.0
 **/
public class A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String a = s.next();
        char[] c = a.toCharArray();
        int res = 0;
        if (n % 2 == 1) {
            //奇数个
            int left = 0;
            int right = c.length-1;
            while (left < right){
                if (c[left] == c[right]){
                    left++;
                    right--;
                    continue;
                }else {
                    res++;
                    left++;
                    right--;
                }
            }
        }else {
            //偶数个
            int left = (c.length/2)-1;
            int right = c.length/2;
            while (left >=0 && right <= c.length-1){
                if (c[left] == c[right]){
                    left--;
                    right++;
                }else {
                    res++;
                    left--;
                    right++;
                }
            }
        }
        System.out.println(res);
    }
}
