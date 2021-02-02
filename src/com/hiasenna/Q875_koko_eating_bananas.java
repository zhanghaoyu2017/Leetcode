package com.hiasenna;

/**
 * @ClassName Q875_koko_eating_bananas
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/7/25-15:53
 * @Version 1.0
 **/
public class Q875_koko_eating_bananas {
    public int minEatingSpeed(int[] piles, int H) {
        int lo = 0;
        int hi = Integer.MAX_VALUE;
        while (lo < hi){
            int mid = (lo + hi) / 2;
            if (check(piles,H,mid)) hi = mid;
            else lo = mid+1;
        }
        return lo;
    }
    // Can Koko eat all bananas in H hours with eating speed K?
    public boolean check(int[] piles, int H, int K) {
        int time = 0;
        for (int pile:piles){
            time += Math.ceil(pile*1.0/K);
        }
        return time <= H;
    }

}
