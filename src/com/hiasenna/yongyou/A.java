package com.hiasenna.yongyou;

/**
 * @ClassName A
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/18-15:11
 * @Version 1.0
 **/
public class A {

    public static void main(String[] args) {
        String a = "abbcccdddaaaa";
        System.out.println(compress(a));
    }

    public static String compress(String str) {
        // write code here
        int len = str.length();
        char[] c = str.toCharArray();
        int index = 0;
        int sum = 1;
        String res = "";
        while (index < c.length - 1) {
            if (c[index] == c[index + 1]) {
                sum++;
            } else {
                res += c[index];
                res += sum;
                sum = 1;
            }
            index++;
        }
        res += c[index];
        res += sum;
        if (res.length() > str.length()) {
            return str;
        } else {
            return res;
        }
    }
}
