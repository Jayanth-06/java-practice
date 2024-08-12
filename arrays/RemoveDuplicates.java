package com.java.arrays;

public class RemoveDuplicates {
	
	 static void  Rdd(int[] nums) {
		int rd = 0;
		for(int i = 1 ; i < nums.length ; i++) {
			if(nums[rd] != nums[i]) {
				rd++;
				nums[rd] = nums[i];	
				}
		}
	}

	public static void main(String[] args) {
		int [] nums = { 8 , 5 , 9 , 3 , 1 , 5 , 9 , 8};
		for(int i = 0 ; i < nums.length ; i++) {
			System.out.print(nums[i] + " ");
		}
		Rdd(nums);
		System.out.println();
		for(int i = 0 ; i < nums.length ; i++) {
			System.out.print(nums[i] + " ");

	}

}
}
