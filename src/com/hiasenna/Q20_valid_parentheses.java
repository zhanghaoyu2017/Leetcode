package com.hiasenna;

import java.util.Stack;

/**
 * @ClassName Q20_valid_parentheses
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/7/28-9:45
 * @Version 1.0
 **/
public class Q20_valid_parentheses {
    public boolean isValid(String s) {
        if (s.isEmpty()){
            return true;
        }
        Stack<Character> stack = new Stack<>();
        char[] c = s.toCharArray();
        for (char ch :c){
            if (ch=='('){
                stack.push(')');
            }else if (ch == '{'){
                stack.push('}');
            }else if (ch == '['){
                stack.push(']');
            }else if (stack.empty() || ch!=stack.pop()){
                return false;
            }
        }
        if (stack.empty()) return true;
        return false;
    }
}
