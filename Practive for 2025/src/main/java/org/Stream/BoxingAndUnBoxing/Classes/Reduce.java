package org.Stream.BoxingAndUnBoxing.Classes;

import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Reduce {
    public static void main(String[] args) {

        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);

        Optional<Integer> result = stream.peek(integer -> System.out.println(integer)).reduce(Integer::sum);
        System.out.println(result);

        IntStream intStream = IntStream.rangeClosed(1,10);
        Stream<Integer> integerStream = intStream.boxed();

        integerStream.map( no ->{
            return no.hashCode();
                }).forEach(hash -> System.out.println(hash));
    }
}
