package com.hiasenna;

public class Q35 {

	public static void main(String[] args) {
		int[] nums = {1,3,5,6};
		System.out.println(searchInsert(nums,2));
	}

	 public static int searchInsert(int[] nums, int target) {
		 int left = 0;
		 int right = nums.length-1;
		 while (left <= right) {
			 int mid = (left + right) / 2;
			 if (nums[mid] == target) {
				return mid;
			}else if (target < nums[mid]) {
				right = mid - 1;
				
			}else {
				left = mid + 1;
			}
			 
		}
		 return left;
	 }
}


//二分模板
class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1; // 注意
        while(left <= right) { // 注意
            int mid = (left + right) / 2; // 注意
            if(nums[mid] == target) { // 注意
                // 相关逻辑
            } else if(nums[mid] < target) {
                left = mid + 1; // 注意
            } else {
                right = mid - 1; // 注意
            }
        }
        // 相关返回值
        return 0;
    }
}
