package org.Stream.MethodReferencePart1.Classes;

import java.util.Comparator;
import java.util.stream.Stream;

public class Seed {
    public static void main(String[] args) {
        Stream.iterate(0, i -> i + 1)
                .limit(20)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}
