package javaUdacity;

public class binarySearch {
	public static int binarySearch(int[] arr, int target) {
	    int left = 0;
	    int right = arr.length - 1;
	    
	    while (left <= right) {
	        int mid = left + (right - left) / 2;
	        
	        if (arr[mid] == target) {
	            return mid;
	        } else if (arr[mid] < target) {
	            left = mid + 1;
	        } else {
	            right = mid - 1;
	        }
	    }
	    
	    return -1;
	}
	public static void main(String[] args) {
		int[] nums = {1, 5, 7, 8, 9, 11, 18, 19, 20, 25};
		int target = 11;

		int result = binarySearch(nums, target);

		System.out.println(result); // Output: 5

		target = 10;
		result = binarySearch(nums, target);

		System.out.println(result); // Output: -1
	}
}
