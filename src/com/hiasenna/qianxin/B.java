package com.hiasenna.qianxin;

import java.util.Scanner;
import java.util.Stack;

/**
 * @ClassName B
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/16-16:02
 * @Version 1.0
 **/
public class B {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        if (str == null) return;
        str = str.replace("\t"," ");
        String[] ss = str.split(" ");
        Stack<String> stack1 = new Stack<>();
        Stack<String> stack2 = new Stack<>();
        for (int i = 0; i < ss.length; i++) {
            if (ss[i].equals("undo") && !stack1.isEmpty()) {
                stack2.push(stack1.pop());
            } else if (ss[i].equals("redo") && !stack2.isEmpty()) {
                stack1.push(stack2.pop());
            } else {
                stack1.push(ss[i]);
            }
        }
        if (!stack1.isEmpty()) {
            String[] tmp = new String[stack1.size()];
            for (int i = stack1.size() - 1; i >= 0; i--) {
                tmp[i] = stack1.pop();
            }
            StringBuilder res = new StringBuilder();
            for (int i = 0; i < tmp.length; i++) {
                res.append(tmp[i]);
                if (i != tmp.length - 1) {
                    res.append(" ");
                }
            }
            System.out.println(res.toString());
        }
    }

    static String a(String str) {
        String[] ss = str.split(" ");
        Stack<String> stack1 = new Stack<>();
        Stack<String> stack2 = new Stack<>();
        stack1.push(ss[0]);
        for (int i = 1; i < ss.length; i++) {
            if (ss[i].equals("undo")) {
                System.out.println("撤销" + stack1.peek());
                stack2.push(stack1.pop());
            } else if (ss[i].equals("redo")) {
                System.out.println("恢复" + stack2.peek());
                stack1.push(stack2.pop());
            } else {
                stack1.push(ss[i]);
            }
        }
        for (int i = 0; i <= stack1.size(); i++) {
            System.out.println(stack1.pop());
        }
//        String[] tmp = new String[stack1.size()];
//        for (int i = stack1.size() - 1; i > 0; i--) {
//            tmp[i] = stack1.pop();
//        }
//        StringBuilder res = new StringBuilder();
//        for (int i = 0; i < tmp.length; i++) {
//            res.append(tmp[i]);
//            if (i != tmp.length - 1) {
//                res.append(" ");
//            }
//        }
//        System.out.println(res.toString());
        return "sss";
    }
}
