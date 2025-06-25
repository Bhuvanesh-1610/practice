package javaTraining.DataStructureAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10 };

//        int left = 0;
//        int right = arr.length-1;
//
        int target = 1;
//        int count = 0;
//        while(left <= right) {
//            int mid = right + left/2;
//            if(arr[mid] == target) {
//                System.out.println(mid);
//                count = 1;
//                break;
//            }
//            else if(arr[mid] > target) {
//                right = mid - 1;
//            }
//            else if(arr[mid] < target) {
//                left = mid + 1;
//            }
//        }
//        if (count !=1)
//                System.out.println("Not Found");
        int length =arr.length-1;
        int j =length;
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        list.parallelStream().filter(i -> i == target).findFirst().ifPresentOrElse(i  -> System.out.println(i), ()-> System.out.println("not found") ) ;

    }


}
