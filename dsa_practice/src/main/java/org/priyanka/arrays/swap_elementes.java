package org.priyanka.arrays;

import java.util.Arrays;

public class swap_elementes {
    public static void main(String[] args) {

        int[] arr = {23,4,1,5,26,3};
        //swap adjacant elements
        swap(arr);

    }

    static void swap(int arr[]){
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
