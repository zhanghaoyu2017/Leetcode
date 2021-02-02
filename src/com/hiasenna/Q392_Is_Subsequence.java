package com.hiasenna;

import java.util.Arrays;

/**
 * @ClassName Q392_Is_Subsequence
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/7/22-16:43
 * @Version 1.0
 **/
public class Q392_Is_Subsequence {


    public static boolean isSubsequence(String s, String t) {
        char[] a = s.toCharArray();
        int index = -1;
        for (int i =0;i<a.length;i++){
            index = t.indexOf(a[i],index+1);
            if (index ==-1) return false;
        }
        return true;
    }
    //贪心算法
    public boolean isSubsequence2(String s, String t) {
        int k  = 0;
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        for (int i = 0;i< t.length() && k<s.length();i++){
            if (a[k] == b[i]) k++;
        }
        return k==s.length();
    }

}
