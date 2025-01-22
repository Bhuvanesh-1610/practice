package org.Stream;

import java.util.Arrays;
import java.util.stream.Stream;
import java.util.*;

public class StreamPrac {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 8, 9,  2, 3, 4, 5, 6, 7, 10);

       Stream<Integer> streams =  Stream.of(1,5,111,24,56,12,61,6,56,15,13,75).sorted();
       streams.forEach(System.out::println);

        Stream<Integer> stream = list.parallelStream();

      List<Integer> sum = stream
              .skip(4)
            .peek(System.out::println)

            .filter(i -> i % 2 == 0)
              .limit(3)
            .toList();
//            .map(i -> i * i).reduce(10,Integer::sum);

        System.out.println("count :"+sum.stream().count());
    }

}
