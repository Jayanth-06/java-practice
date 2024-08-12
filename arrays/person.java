package com.java.arrays;

public class person {

	public static void main(String[] args) {
		int size = 5;
		int[] resultArr = createArray(size);
		for (int i=0; i<size; i++){
		System.out.println(resultArr[i]);
		}
		}
		public static int[] createArray(int size) {
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
		array[i] = i;
		}
		return array;
		}
		}
