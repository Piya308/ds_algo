package org.priyanka.arrays;

import java.util.Arrays;

public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declaration - reference of an array 
		int arr[];
		
		//actual declaration of array using new keyword
		//in Java array is internally treated as Object
		
		int arr1[] = new int [10];
		
		// if you are accessing index which is negative or more than specified array's value.
		int[] arr3 = {4,5,3,5,3,986,56,4,34,23,56,34,32,2,8};
//		System.out.println(arr3[14]);
		
		//you can not initialize array and also providing array size once.
		//it will throw as "Cannot define dimension expressions when an array initializer is provided"
//		int[] arr4 = new int[2] {4,5,3,5,3,986,56,4,34,23,56,34,32,2,8};
		
	}

}
