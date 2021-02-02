package com.hiasenna;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName Q459
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/24-18:30
 * @Version 1.0
 **/
public class Q459 {
    public boolean repeatedSubstringPattern(String s) {

        String a = (s + s).substring(1, 2 * s.length() - 1);
        if (a.contains(s)) {
            return true;
        } else {
            return false;
        }
    }
}
