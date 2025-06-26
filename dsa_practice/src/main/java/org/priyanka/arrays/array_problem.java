package org.priyanka.arrays;

public class array_problem {
    public static void main(String[] args) {

        System.out.println("second largest  "+findSecondLargest(new int[]{-2, -4, -66, -1}));

    }

    public static int findSecondLargest(int[] arr) {
        int max = arr[0];

        int secMax = Integer.MIN_VALUE;  // Use Integer.MIN_VALUE to ensure proper comparison
        for(int x : arr){
            if(x>max){
                secMax = max;
                max = x;
            }
            else if(x< max && x > secMax){
                secMax = x;
            }
        }
        return secMax == Integer.MIN_VALUE ? -1 : secMax;
    }
}

 class arrayy_problem {
    int x =10;
    public static void main(String[] args) {
        arrayy_problem arrayyProblem = new arrayy_problem();
        System.out.println(arrayyProblem.x);
    }

    static{
        int x =30;
        System.out.println(x);
    }
    }

