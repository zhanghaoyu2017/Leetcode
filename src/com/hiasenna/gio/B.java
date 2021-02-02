package com.hiasenna.gio;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

/**
 * @ClassName B
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/8/30-10:23
 * @Version 1.0
 **/
public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution ans = new Solution();
        while (sc.hasNextLine()) {
            String[] targetLine = sc.nextLine().split(" ");
            int[] targets = new int[targetLine.length];
            for (int i = 0; i < targetLine.length; i++) {
                targets[i] = Integer.parseInt(targetLine[i]);
            }
            int target = Integer.parseInt(sc.nextLine());
            int out = ans.search(targets, target);
            System.out.println(out + "\n");
        }

    }
}

class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        while (left <= right) {
            mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid;
            }else if (nums[mid] < target){
                left = mid+1;
            }
        }
        return -1;
    }
}
