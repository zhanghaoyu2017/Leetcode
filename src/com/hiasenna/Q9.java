package com.hiasenna;

/**
 * @ClassName Q9
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/19-10:48
 * @Version 1.0
 **/
public class Q9 {
    public static void main(String[] args) {
        System.out.println(isPalindrome2(123));
    }
    public boolean isPalindrome(int x) {
        StringBuilder s = new StringBuilder(x + "");
        return s.reverse().toString().equals(x + "");
    }

    public static boolean isPalindrome2(int x) {
        if (x == 0) return true;
        if (x < 0 || x % 10 == 0) {
           return false;
        }
        int reverse = 0;
        while (x > reverse){
            reverse = reverse*10 + x%10;
            x  /= 10;
        }
        if (x == reverse || x == reverse/10){
            return true;
        }else {
            return false;
        }

    }
}
