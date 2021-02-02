package com.hiasenna;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName Q202
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/9/16-16:32
 * @Version 1.0
 **/
public class Q202 {

    public boolean isHappy(int n) {
       Set<Integer> set = new HashSet<>();
       int m = 0;
       while (true){
           while (n!=0){
               m += Math.pow(n%10,2);
               n /= 10;
           }
           if (m==1) return true;
           //set重复即为死循环
           if (set.contains(m)) {
               return false;
           }else {
               set.add(m);
               n = m;
               m = 0;
           }

       }


    }
}
