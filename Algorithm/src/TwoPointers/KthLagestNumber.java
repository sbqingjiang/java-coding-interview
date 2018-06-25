package TwoPointers;

import java.util.Arrays;

import utils.Utils;

public class KthLagestNumber {

	public static void main(String[] args) {
		int[] nums = new int[] { 3, 5, 1, 2, 4 };
		System.out.println(findKthLargest2(nums, 1));
	}

	public static int findKthLargest1(int[] nums, int k) {
		Arrays.sort(nums);
		return nums[nums.length - k];
	}

	public static int findKthLargest2(int[] nums, int k) {
		if (k < 1 || nums == null) {
			return 0;
		}
		// find Kth largest is equal to find n+1-k smallest
		return getKth(nums.length - k + 1, nums, 0, nums.length - 1);
	}

	public static int getKth(int k, int[] nums, int start, int end) {
		int pivot = nums[end];
		int left = start;
		int right = end;

		while (true) {

			while (nums[left] < pivot && left < right) {
				left++;
			}

			while (nums[right] >= pivot && right > left) {
				right--;
			}

			if (left == right) {
				break;
			}
			Utils.swap(nums, left, right);
		}

		Utils.swap(nums, left, end);
		if (k == left + 1)
			return pivot;
		else if (k < left + 1) {
			return getKth(k, nums, start, left - 1);
		} else {
			return getKth(k, nums, left + 1, end);
		}
	}

}
