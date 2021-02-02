package com.hiasenna;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
public class Q108 {
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public static void main(String[] args) {
		int[] nums = { -10, -3, 0, 5, 9 };
		TreeNode node = sortedArrayToBST(nums);
		preOrderTraverse1(node);
	}

	public static TreeNode sortedArrayToBST(int[] nums) {
		return helper(nums, 0, nums.length - 1);
	}

	public static TreeNode helper(int[] nums, int left, int right) {
		if (left > right) {
			return null;
		}

		int mid = (left + right) / 2;
		TreeNode root = new TreeNode(nums[mid]);
		root.left = helper(nums, left, mid - 1);
		root.right = helper(nums, mid + 1, right);
		return root;
	}

	// 前序
	public static void preOrderTraverse1(TreeNode root) {
		if (root != null) {
			System.out.print(root.val + "->");
			preOrderTraverse1(root.left);
			preOrderTraverse1(root.right);
		}
	}

	// 中序
	public static void inOrderTraverse(TreeNode root) {
		if (root != null) {
			inOrderTraverse(root.left);
			System.out.print(root.val + "->");
			inOrderTraverse(root.right);
		}
	}

	// 后序
	public static void postOrderTraverse(TreeNode root) {
		if (root != null) {
			postOrderTraverse(root.left);
			postOrderTraverse(root.right);
			System.out.print(root.val + "->");
		}
	}

}
