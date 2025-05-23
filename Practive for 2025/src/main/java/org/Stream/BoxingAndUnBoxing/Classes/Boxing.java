package org.Stream.BoxingAndUnBoxing.Classes;

import java.util.ArrayList;
import java.util.Objects;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Boxing {
    public static void main(String[] args) {
      ArrayList<Integer> list = new ArrayList<>();

      list.add(1);
      list.add(2);

      int integer = list.get(0);

      System.out.println(integer);

        Stream <Integer> intergerStream = Stream.of(1,2,3,4,5,5,6,6,7,7,8,8,9,9);



        IntStream intStream = IntStream.of(1, 2, 3,4,5,6,7,8,9,10,-100);
//        System.out.println(intStream.sum());
//        System.out.println(intStream.max());
//        OptionalInt optionalInt = intStream.min();
        if(1>0){
            System.out.println(intStream.min().getAsInt());
        }

//        intStream.forEach(System.out::println);

    }
}
