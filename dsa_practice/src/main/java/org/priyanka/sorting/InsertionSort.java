package org.priyanka.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 10, 11};
        int j;
        for (int i = 0; i < arr.length-1; i++) {
            for ( j =i+1; j>0 && arr[j] < arr[j-1]  ; j--) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                System.out.println("run");

                }
        }
        System.out.println(Arrays.toString(arr));

    }
}
