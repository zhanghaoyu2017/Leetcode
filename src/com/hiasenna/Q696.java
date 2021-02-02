package com.hiasenna;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Q696
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/10-10:18
 * @Version 1.0
 **/
public class Q696 {
    public static void main(String[] args) {
        System.out.println(countBinarySubstrings("00110011"));
    }
    public static int countBinarySubstrings(String s) {
        int n = s.length();
        int len = 1;
        int res = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                len++;
            } else {
                list.add(len);
                len = 1;
            }
        }
        list.add(len);
        for (int i = 1 ;i<list.size();i++){
            res +=Math.min(list.get(i),list.get(i-1));
        }
        return res;
    }
}
