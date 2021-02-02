package com.hiasenna.jingdong;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @ClassName B
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/6-20:18
 * @Version 1.0
 **/
public class B {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        List<Integer> list = new ArrayList<>();
        int count = 0;

    }

    //判断一个数是素数
    public boolean isSUshu(int a) {
        for (int j = 2; j < a; j++) {
            if (a % j == 0) {
                return false;
            }
        }
        return true;
    }

}
