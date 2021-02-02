package com.hiasenna.wangyi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @ClassName B
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/9/12-15:03
 * @Version 1.0
 **/
public class B {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 0);
        map.put("b", 0);
        map.put("c", 0);
        map.put("x", 0);
        map.put("y", 0);
        map.put("z", 0);
        String str = s.next();
        for (int i = 0; i < str.length(); i++) {
            String tmp = str.charAt(i) + "";
            if (map.containsKey(tmp)) {
                map.put(tmp, map.get(tmp) + 1);
            }
        }
        int res = str.length();
        for (int i = str.length() - 1; i >= 0; i--) {
            if (map.get("a") % 2 == 0 && map.get("b") % 2 == 0 && map.get("c") % 2 == 0 &&
                    map.get("x") % 2 == 0 && map.get("y") % 2 == 0 && map.get("z") % 2 == 0) {
                break;
            }
            String cur = str.charAt(i) + "";
            if (map.containsKey(cur)) {
                if (map.get(cur) % 2 == 1) {
                    res--;
                    map.put(cur, map.get(cur) - 1);
                } else {
                    res--;
                    map.put(cur, map.get(cur) - 1);
                }
            } else {
                res--;
            }
        }
        if (map.get("a") == 0 && map.get("b") == 0 && map.get("c") == 0 &&
                map.get("x") == 0 && map.get("y") == 0 && map.get("z") == 0) {
            System.out.println(0);
        } else {
            System.out.println(res);
        }
    }

}

