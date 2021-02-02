package com.hiasenna;

/**
 * @ClassName Q557
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/6-10:19
 * @Version 1.0
 **/
public class Q557 {
    public String reverseWords(String s) {
        String[] c = s.split(" ");
        String res = "";
        for (int i = 0; i < c.length; i++) {
            StringBuilder a = new StringBuilder(c[i]);
            res += a.reverse();
            if (i!=c.length-1){
                res += " ";
            }
        }
        return res;
    }
}
