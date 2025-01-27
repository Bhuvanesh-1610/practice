package org.Stream;

import java.util.stream.Stream;

public class TakeWhile {
    public static void main(String [] args ) {
        Stream.of(1,2,3,4,5,6,7,8,9,10)
                .peek(i->System.out.println("applying take while "+i))
                .takeWhile(x -> x < 5)
                .forEach(System.out::println);
    }
}
