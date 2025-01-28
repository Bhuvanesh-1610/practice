package org.Stream.Classes;

import java.util.stream.Stream;

public class Skip {
    public static void main(String[] args) {
        Stream.of("joe","adam","peter","john","Dhoni","joe","JOe","adam","robin")
                .distinct()
                .forEach(System.out::println);
    }
}
