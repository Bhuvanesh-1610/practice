package javaTraining.Looping;

public class MergeSort {
    public static void MergeSort(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1;
        for (int k = left; k <= right; k++) {
            if (i > mid) {
                temp[k] = arr[j++];
            }
            else if (j > right) {
                temp[k] = arr[i++];
            }
            else if (arr[i] < arr[j]) {
                temp[k] = arr[i++];
            }
        }
        for (int k = left; k <= right; k++) {
            arr[k] = temp[k];
        }
    }
    public static void main(String[] args) {
        int [] arr = new int [10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 100);
        }
        MergeSort m = new MergeSort();
        MergeSort(arr, 0, 0+arr.length-1/2, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
