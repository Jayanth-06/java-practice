package com.java.arrays;
import java.util.*;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		System.out.println();
		int id;
		int[] ids = new int[4];
		ids[0] = sc.nextInt();
		ids[1] = sc.nextInt();
		ids[2] = sc.nextInt();
		ids[3] = sc.nextInt();
		System.out.println("reversed array = ");
		for(int i = ids.length - 1;i >= 0;i--) {
			int revarr = ids[i];
			System.out.print( revarr + " " );
		}
		System.out.println();
		
		
	     

	}

}
