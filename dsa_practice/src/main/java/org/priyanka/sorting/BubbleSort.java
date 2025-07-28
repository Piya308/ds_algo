package org.priyanka.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,};
        bubbleSort(arr,arr.length);
    }

   static void bubbleSort(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            int didSwap =0;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    didSwap =1;
                }
            }
            if(didSwap ==0){ // helps in achieving O(n) if array is sorted
                break;
            }
            System.out.println("runs");
        }
       System.out.println(Arrays.toString(arr));
    }
}
