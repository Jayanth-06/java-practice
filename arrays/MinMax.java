package com.java.arrays;

public class MinMax {

	public static void main(String[] args) {
		int [] nums = { 8 , 5 , 9 , 3 , 1 };
		int max = nums[0];
		int min = nums[0];
		 for( int i = 0 ; i < nums.length ; i++) {
			 if(nums[i] < min) {
				 min = nums[i];
			 }
			 if(nums[i] > max) {
				 max = nums[i];
			 }
		 }
		 System.out.println("Minimum number : " + min);
		 System.out.println("Maximum number : " + max);
	}

}
