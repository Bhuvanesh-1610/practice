package javaTraining.DataStructureAlgorithm.Sort;

public class FindSecondLargest {
    public static void main(String[] args) {
        int [] arr = new int [10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        int secondLargest = arr[0];
       int Largest = arr[arr.length - 1];
       for (int i = 0; i < arr.length; i++) {
           if (arr[i] > secondLargest) {
               secondLargest = arr[i];
           }
       }
    }
}
