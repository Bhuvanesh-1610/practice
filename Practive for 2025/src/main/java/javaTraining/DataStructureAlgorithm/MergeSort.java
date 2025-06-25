package javaTraining.DataStructureAlgorithm;

public class MergeSort {

    public  static void merge(int[] arr, int left, int mid, int right) {
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
        System.arraycopy(temp, 0, arr, left, temp.length);
    }

    public static void main(String[] args) {
        int arr[] ={8,3,4,5,3,2,7,1,};
        merge(arr, 0, 0+arr.length-1/2, arr.length-1);
    }
}
