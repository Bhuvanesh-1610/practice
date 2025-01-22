package org.Stream;

import java.util.stream.Stream;

public class Seed {
    public static void main(String[] args) {
        Stream.iterate(1L, i -> i + i)
                .limit(100)
                .forEach(i -> {System.out.println(i);});
    }
}
