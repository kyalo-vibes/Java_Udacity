package javaUdacity;

import java.util.Arrays;

public class recursion {
	public static void permute(int[] nums, int start) {
	    if (start == nums.length - 1) {
	        // We've reached the end of the array, so we have a complete permutation
	        System.out.println(Arrays.toString(nums));
	    } else {
	        // Swap each element with every element that comes after it
	        for (int i = start; i < nums.length; i++) {
	            swap(nums, start, i);
	            permute(nums, start + 1);
	            swap(nums, start, i); // swap back to restore original order
	        }
	    }
	}

	public static void swap(int[] nums, int i, int j) {
	    int temp = nums[i];
	    nums[i] = nums[j];
	    nums[j] = temp;
	}
	
	public static void main(String[] args) {
		int[] nums = {1, 2};
		permute(nums, 0);

		nums = new int[] {1, 2, 3};
		permute(nums, 0);

	}
}