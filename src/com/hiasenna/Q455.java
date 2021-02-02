package com.hiasenna;

import java.util.Arrays;

/**
 * @ClassName Q455
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/7/26-10:09
 * @Version 1.0
 **/
public class Q455 {
    //贪心的思想是，用尽量小的饼干去满足小需求的孩子，所以需要进行排序先
    public int findContentChildren(int[] g, int[] s) {
        int child = 0;
        int cookie = 0;
        Arrays.sort(g);  //先将饼干 和 孩子所需大小都进行排序
        Arrays.sort(s);
        while (child < g.length && cookie < s.length ){ //当其中一个遍历就结束
            if (g[child] <= s[cookie]){ //当用当前饼干可以满足当前孩子的需求，可以满足的孩子数量+1
                child++;
            }
            cookie++; // 饼干只可以用一次，因为饼干如果小的话，就是无法满足被抛弃，满足的话就是被用了
        }
        return child;
    }


    public String restoreString(String s, int[] indices) {
        char[] a = s.toCharArray();
        char[][] q = new char[a.length][2];

        for (int i = 0 ;i<a.length;i++){
           q[i][0] = a[i];
           q[i][1] = (char) indices[i];
        }
        Arrays.sort(q,(o1, o2) -> o1[1]-o2[1]);
        String w ="";
        for(int i =0;i<a.length;i++){
            w += q[i][0];
        }
        return w;
    }
}
