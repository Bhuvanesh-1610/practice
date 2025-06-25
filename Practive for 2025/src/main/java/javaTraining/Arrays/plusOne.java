package javaTraining.Arrays;

import java.util.Arrays;

public class plusOne {
    public static int[] plus(int[] arr){
        for(int i = arr.length-1; i >= 0; i--){
            if(arr[i] != 9){
                arr[i] = arr[i]+1;
                return arr;
            }
            else{
                arr[i] = 0;
            }
        }
        int arr1[] = new int[arr.length+1];
        arr1[0] = 1;
        return arr1;
    }

    public static void main(String[] args) {
        int arr []= {9,9,9};
        int arr3 []= {9,0,9};


        System.out.println(Arrays.toString(plus(arr)));
        System.out.println(Arrays.toString(plus(arr3)));

    }
}
