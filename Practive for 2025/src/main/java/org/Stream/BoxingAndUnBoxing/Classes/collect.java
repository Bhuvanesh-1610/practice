package org.Stream.BoxingAndUnBoxing.Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class collect {
    public static void main(String[] args) {
        for(int i=0; i<10;i++){
        List<Integer> list = Stream.iterate(0, num -> num+1).parallel().limit(20).collect(Collectors.toCollection(ArrayList:: new));
        System.out.println(list);
        System.out.println(list.size());
    }
        }
}
