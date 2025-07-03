package org.priyanka.arrays;

import java.util.Arrays;

public class problems {
    public static void main(String[] args) {

        int arr[] = {3, 8, 6, 8};
        System.out.println(betterFindSecondLargest(arr));
        System.out.println(betterPairSum(arr, 7));
        System.out.println(bruteForcePairsum(arr, 7));
        swapAdjacentElements(arr);

    }

        static int betterPairSum(int[] arr, int target) {
        //find count of sum of pair from array for given target
            int count = 0; int sum; int start = 0; int end = arr.length - 1;
            while (start < end) {
                sum = arr[start] + arr[end];
                if (sum == target) {
                    ++count;
                    start++;
                    end--;
                } else if (sum > target) {
                    end--;
                } else {
                      start++;
                }
            }
            return count;
        }

        public static int bruteForcePairsum(int[] arr, int target) {
            int count = 0; int sum;
            for (int i = 0; i <= arr.length - 1; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    sum = arr[i] + arr[j];
                    if (sum == target) {
                        ++count;
                    }
                }
            }
            return count;
        }

    public static void bruteforceFindSecondLargest(){
        //testcase 2,13,4,1,2,6,28
        //testcase2 9,3,6,2,9
        //testcase3 6,6,6,6,6,6 ----> output default value of Integer
        //this solution1 works for testcase1 ,
        //if all elements are same then there is no 2nd largest for this scenario this won't work
        int[] testcaseArray1 = {2,13,4,1,2,6,28};
        Arrays.sort(testcaseArray1); // 1,2,2,4,6,13,28
        System.out.println(testcaseArray1[testcaseArray1.length-2]);

        //solution2 with edgecase
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

    public static int betterFindSecondLargest(int[] arr) {
        int max = arr[0];

        int secMax = Integer.MIN_VALUE;  // Use Integer.MIN_VALUE to ensure proper comparison
        for(int x : arr){
            if(x>max){
                secMax = max;
                max = x;
            }// condition &- if largest number comes twice
            else if(x< max && x > secMax){
                secMax = x;
            }
        }
        return secMax == Integer.MIN_VALUE ? -1 : secMax;
    }

    static void swapAdjacentElements(int arr[]){
        for(int i=0; i<arr.length-1; i+=2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        for (int i : arr) {
            System.out.print("\t"+i);
        }
    }
}

