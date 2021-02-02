package com.hiasenna.tencent;

import java.util.Scanner;

/**
 * @ClassName E
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/23-21:42
 * @Version 1.0
 **/
public class E {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        int n = s.nextInt();
        for (int i =0;i<n;i++){
            int res = 0;
            int start = s.nextInt()-1;
            int end = s.nextInt();
            String tmp = str.substring(start,end);
            int left =0;
            int right = tmp.length()-1;
            boolean flag = true;
            while (left < right){
                if (tmp.charAt(left) == tmp.charAt(right)){
                    left++;
                    right--;
                }else {
                    flag = false;
                    break;
                }
            }
            if (flag) res++;
            System.out.println(2);
        }

    }
}
