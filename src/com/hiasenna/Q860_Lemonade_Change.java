package com.hiasenna;

/**
 * @ClassName Q860_Lemonade_Change
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/7/22-16:26
 * @Version 1.0
 **/
public class Q860_Lemonade_Change {

    public static boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        for (int bill : bills) {
            if (bill == 5) five++;
            else if (bill == 10) {
                if (five == 0) return false;
                ten++;
                five--;
            } else {
                if (five > 0 && ten > 0) {
                    five--;
                    ten--;
                } else if (five > 3) {
                    five -= 3;
                }else {
                    return false;
                }
            }
        }
        return true;

    }
}
