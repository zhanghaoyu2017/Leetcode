package com.hiasenna.tongcheng;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName C
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/31-20:56
 * @Version 1.0
 **/
public class C {
    public static void main(String[] args) {
        System.out.println(translateNum(12158));
    }

    /**
     * 翻译组合数
     *
     * @param num int整型 数字加密报文
     * @return int整型
     */
    public static int translateNum(int num) {
        // write code here
        String str = num + "";
        List<List<Integer>> res = new ArrayList<>();
        dfs(str, 0, res, new ArrayList<>());
        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i));
        }
        return res.size();
    }

    static void dfs(String str, int index, List<List<Integer>> res, List<Integer> chain) {
        if (index >= str.length()) {
            List<Integer> tmp = new ArrayList<>(chain);
            if (!res.contains(tmp)) {
                res.add(tmp);
                return;
            }
        }
        if (str.charAt(index) - '0' >= 0) {
            chain.add(str.charAt(index) - '0');
            dfs(str, index + 1, res, chain);
            chain.remove(chain.size() - 1);
            if (index + 1 < str.length()) {
                int a = str.charAt(index) - '0';
                int b = str.charAt(index + 1) - '0';
                int c = a * 10 + b;
                if (c <= 25 && c >= 10) {
                    chain.add(c);
                    dfs(str, index + 2, res, chain);
                    chain.remove(chain.size() - 1);
                }
            }
        }
    }

}
