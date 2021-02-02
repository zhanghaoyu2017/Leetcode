package com.hiasenna;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @ClassName Q139_Word_Break
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/7/22-11:48
 * @Version 1.0
 **/
public class Q139_Word_Break {


    public static boolean wordBreak(String s, List<String> wordDict) {
        //dp[i] 表示字符串 s 前 i 个字符组成的字符串 s[0..i-1]是否能被空格拆分成若干个字典中出现的单词
        Set<String> wordDictSet = new HashSet(wordDict);
        int n = s.length();
        boolean[] dp = new boolean[n+1];
        dp[0] = true;
        for (int i = 0;i<n+1;i++){
            for (int j =0;j<i;j++){
                if (wordDictSet.contains(s.substring(j,i)) &&dp[j]){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n];
    }
}
