package com.hiasenna.sanliuling;

import java.util.*;

/**
 * @ClassName D
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/24-13:56
 * @Version 1.0
 **/
public class D {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] is = {"A","H" ,"I", "M", "O", "T", "U", "V", "W", "X", "Y"};
        Set<String> set = new HashSet<>();
        for (int i = 0; i < is.length; i++) {
            set.add(is[i]);
        }
        while (s.hasNext()) {
            String str = s.next();
            boolean flag = true;
            for (int i = 0; i < str.length(); i++) {
                if (set.contains(str.charAt(i)+"")) {
                    continue;
                } else {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                //在判断是不是回文
                int left = 0;
                int right = str.length() - 1;
                boolean flag2 = true;
                while (left < right) {
                   if (str.charAt(left) == str.charAt(right)){
                       flag2 = true;
                       left++;
                       right--;
                   }else {
                       flag2 = false;
                       break;
                   }
                }
                if (flag2){
                    System.out.println("YES");
                }else {
                    System.out.println("NO");
                }
            } else {
                System.out.println("NO");
            }
        }
    }
}
