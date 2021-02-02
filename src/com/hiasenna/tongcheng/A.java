package com.hiasenna.tongcheng;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName A
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/31-20:28
 * @Version 1.0
 **/
public class A {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add("a");
        a.add("a");
        a.add("c");
        ArrayList<String> b = new ArrayList<>();
        b.add("a");
        b.add("a");
        b.add("c");
        ArrayList<String> c = new ArrayList<>();
        c.add("a");
        c.add("a");
        c.add("c");
        ArrayList<ArrayList<String>> values = new ArrayList<>();
        values.add(a);
        values.add(b);
        values.add(c);
        ArrayList<String> res = findCommonString(values);
        for (int i = 0;i<res.size();i++){
            System.out.println(res.get(i));
        }
    }

    public static ArrayList<String> findCommonString(ArrayList<ArrayList<String>> values) {
        // write code here
        int n = values.size();
        if (n == 0 || values==null) return null;
        ArrayList<String> res = values.get(0);
        if (n==1) return res;
        for (int i = 1; i < values.size(); i++) {
            ArrayList<String> tmp = values.get(i);
            for (int j = res.size() - 1; j >= 0; j--) {
                if (!tmp.contains(res.get(j))) {
                    res.remove(j);
                }
            }
        }
        ArrayList<String> res2 = new ArrayList<>();
        for (int i = 0;i<res.size();i++){
            if (!res2.contains(res.get(i))){
                res2.add(res.get(i));
            }
        }
        return res2;
    }
}
