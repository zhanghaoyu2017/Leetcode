package com.hiasenna;

/**
 * @ClassName Q91_Decode_Ways
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/7/21-10:48
 * @Version 1.0
 **/
public class Q91_Decode_Ways {
    /**
     * 如果x=='0'，且y=='0'，无法解码，返回0；
     * 如果只有x=='0'，则y只能单独放在最后，不能与x合并(不能以0开头)，此时有：
     * dp[i] = dp[i-1]
     * 如果只有y=='0'，则y不能单独放置，必须与x合并，并且如果合并结果大于26，返回0，否则有：
     * dp[i] = dp[i-2]
     * 如果 xy<=26: 则y可以“单独”放在abcx的每个解码结果之后后，并且如果abcx以x单独结尾，此时可以合并xy作为结尾，而这种解码种数就是abc的解码结果，此时有：
     * dp[i+1] = dp[i] + dp[i-1]
     * 如果 xy>26: 此时x又不能与y合并，y只能单独放在dp[i]的每一种情况的最后，此时有：
     * dp[i+1] = dp[i]
     */
    public static void main(String[] args) {

    }

    public static int numDecodings(String s) {
        // dp[i] 以 s[i] 结尾的前缀子串有多少种解码方法
        // dp[i] = dp[i - 1] * 1 if s[i] != '0'
        // dp[i] += dp[i - 2] * 1 if  10 <= int(s[i - 1..i]) <= 26
        int n = s.length();
        char[] arr = s.toCharArray();
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = arr[0] == '0' ? 0 : 1;
        if (n <= 1) {
            return dp[1];
        }
        for (int i = 2; i < n + 1; i++) {
            int m = (arr[i - 2] - '0') * 10 + (arr[i - 1] - '0');
            if (arr[i - 1] == '0' && arr[i - 2] == '0') {
                return 0;
            } else if (arr[i - 2] == '0') {
                dp[i] = dp[i - 1];
            } else if (arr[i - 1] == '0') {
                if (m > 26) {
                    return 0;
                }
                dp[i] = dp[i - 2];
            } else if (n > 26) {
                dp[i] = dp[i - 1];
            } else {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
        }
        return dp[dp.length - 1];
    }
    public int numDecodings2(String s) {
        int len = s.length();
        int[] dp = new int[len + 1];

        dp[len] = 1; //将递归法的结束条件初始化为 1
        //最后一个数字不等于 0 就初始化为 1
        if (s.charAt(len - 1) != '0') {
            dp[len - 1] = 1;
        }
        for (int i = len - 2; i >= 0; i--) {
            //当前数字时 0 ，直接跳过，0 不代表任何字母
            if (s.charAt(i) == '0') {
                continue;
            }
            int ans1 = dp[i + 1];
            //判断两个字母组成的数字是否小于等于 26
            int ans2 = 0;
            int ten = (s.charAt(i) - '0') * 10;
            int one = s.charAt(i + 1) - '0';
            if (ten + one <= 26) {
                ans2 = dp[i + 2];
            }
            dp[i] = ans1 + ans2;

        }
        return dp[0];
    }
}


