package com.hiasenna.xiaomi;

import java.util.Scanner;
import java.util.Stack;

/**
 * @ClassName A
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/9/15-19:18
 * @Version 1.0
 **/
public class A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNextLine()) {
            String str = s.nextLine();
            if (str.equals("")) {
                System.out.println(true);
                continue;
            }
            Stack<String> stack = new Stack<String>();
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '(') {
                    stack.push(")");
                } else if (str.charAt(i) == '[') {
                    stack.push("]");
                } else if (str.charAt(i) == '{') {
                    stack.push("}");
                } else {
                    if (!stack.isEmpty()){
                        String tmp = stack.peek();
                        if (tmp.equals(str.charAt(i)+"")) {
                            stack.pop();
                        }
                    }else {
                        stack.push("@@@");
                    }

                }
            }
            if (stack.isEmpty()){
                System.out.println(true);
            }else {
                System.out.println(false);
            }
        }
    }
}
