package com.hiasenna.glodon;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @ClassName B
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/7/29-19:23
 * @Version 1.0
 **/
public class B {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n ;
        n = s.nextInt();
        int[] arr = new int[n];
        for (int i =0;i<n;i++){
            arr[i] = s.nextInt();
        }
        int min = arr[0];
        Set<Integer> set = new HashSet<>(n);
        int index;
        for(int i = 0;i<n;i++){
            min = Math.min(arr[i],min);
        }
        for(int i = 0;i<n;i++){
            if (arr[i] == min){
                if (set.contains(arr[i])){
                    index = i;
                    int tmp = arr[index];
                    for (int j  = i;j<n;j++){
                        if ( j!= index && arr[j] == arr[index]){
                            arr[j] = 2*tmp;
                        }else {
                            arr[j] =arr[j+1];
                        }
                    }
                }else {
                    set.add(arr[i]);
                }
            }else {
                set.add(arr[i]);
            }

        }
        for (int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
