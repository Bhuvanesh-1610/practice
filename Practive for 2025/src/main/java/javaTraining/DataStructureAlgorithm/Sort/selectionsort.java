package javaTraining.DataStructureAlgorithm.Sort;

public class selectionsort {
    public static void main(String[] args) {
        int arr [] = { 4, 2, 6, 3,9,1,3};
        int minIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            if (minIndex != -1) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
