package org.Stream.Practice;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class stream {

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("hello", "world123", "hello", "world123", "javax");

        List<obj> intList = new ArrayList<>();
        Stream<Integer> stream = stringList.stream().map((data)->{
            int counter = 0;
            counter=data.length();
           if(intList.contains(data)){
               obj.count++;
           }
           else{
               new obj(data,counter);
           }
            return counter;
        });
        stream.forEach(System.out::println);
        System.out.println(intList);
    }
}
