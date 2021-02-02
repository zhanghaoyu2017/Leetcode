package com.hiasenna.sanliuling;

import java.util.*;

/**
 * @ClassName B
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/22-19:53
 * @Version 1.0
 **/
public class B {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();//1-n
        List<Integer> list = new ArrayList<>(n);

        int m = s.nextInt();//m 次操作
        int[] p = new int[m];
        for (int i = 0; i < m; i++) {
            p[i] = s.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        for (int i = 0; i < m; i++) {
            if (p[i] == 1) {
                int temp = list.get(0);
                list.remove(0);
                list.add(temp);
            }
            if (p[i] == 2) {
//                int[] arr = new int[n];
//               for (int j = 0;j<n;j++){
//                   arr[j] = list.get(j);
//               }
//               for (int j=1;j<n;j+=2){
//                   int left = arr[j-1];
//                   int right = arr[j];
//                   arr[j-1] = right;
//                   arr[j] = left;
//               }
//               for (int j = 0;j<n;j++){
//                   list.remove(j);
//                   list.add(j,arr[j]);
//               }
//                for (int j = 1; j < n; j += 2) {
//                    int left = list.get(j - 1);
//                    int right = list.get(j);
//                    list.remove(j - 1);
//                    list.add(j - 1, right);
//                    list.remove(j);
//                    list.add(j, left);
//                }
                List<Integer> list2 = new ArrayList<>(n);
                for (int j = 1; j < n; j += 2) {
                    list2.add(j - 1, list.get(j));
                    list2.add(j, list.get(j - 1));
                }
                list.clear();
                list = list2;
            }

        }
        for (int j = 0; j < list.size(); j++) {
            System.out.println(list.get(j));
        }

    }
}
