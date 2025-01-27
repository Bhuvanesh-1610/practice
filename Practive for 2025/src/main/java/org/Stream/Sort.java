package org.Stream;

import org.Stream.interfaces.ISort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort {
    public static void main(String[] args) {
        List<Integer> sortAList = Arrays.asList(2,3,52,24,564,3,5,34);
        System.out.println("before sorting "+sortAList);
        ISort sort = Collections::sort;
        sort.sortAList(sortAList);
        System.out.println("after sorting done"+sortAList);
    }
}
