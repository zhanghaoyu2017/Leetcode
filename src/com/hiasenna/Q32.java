package com.hiasenna;

import java.util.Iterator;
import java.util.Stack;

public class Q32 {

	public static void main(String[] args) {
		String  s = "))()";
		System.out.println(longestValidParentheses(s));

	}

	public static int longestValidParentheses(String s) {
		 int maxs = 0;
		 Stack<Integer> stack = new Stack<Integer>();
		 stack.push(-1);
		 for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				stack.push(i);
			}else {
				stack.pop();
				if (stack.empty()) {
					stack.push(i);
				}else {
					maxs = Math.max(maxs, i-stack.peek());
				}
			}
		}
		 return maxs;
	 }

}
