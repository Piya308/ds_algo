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
		
//		System.out.println(arr3.length);
		secondLargestElementInArray();
	}
	
	public static void secondLargestElementInArray(){
		//testcase 2,13,4,1,2,6,28
		//testcase2 9,3,6,2,9
		//testcase3 6,6,6,6,6,6 ----> output default value of Integer
		
		//this solution works for testcase1 , if all elements are same then there is no 2nd largest for this scenario this won't work
		int[] testcaseArray1 = {2,13,4,1,2,6,28};
		Arrays.sort(testcaseArray1); // 1,2,2,4,6,13,28
		System.out.println(testcaseArray1[testcaseArray1.length-2]);
		
		//solution with edgecase
		int slargestNo ;
		slargestNo = Integer.MIN_VALUE;

		int[] testcaseArray2 = {2,13,4,1,2,6,28};
		Arrays.sort(testcaseArray2); // 1,2,2,4,6,13,28
		for(int i= testcaseArray2.length-1; i>0; i--) {
			if(testcaseArray2[i] != testcaseArray2[i-1]) {
				slargestNo =  testcaseArray2[i-1];
				break;
			}
		}
		System.out.println(slargestNo);
	}

}
