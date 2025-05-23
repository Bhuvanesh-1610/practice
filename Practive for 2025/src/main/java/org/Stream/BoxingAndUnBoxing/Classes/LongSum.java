package org.Stream.BoxingAndUnBoxing.Classes;

import java.util.stream.LongStream;

public class LongSum {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println("first print"+startTime);

        long sum = LongStream.rangeClosed(0,10).reduce(0L, Long::sum);
        System.out.println(System.currentTimeMillis()-startTime);
        System.out.println(sum);
        long startTime1 = System.currentTimeMillis();
        long sum1 = LongStream.rangeClosed(0,10).parallel().reduce(0L, Long::sum);
        System.out.println(System.currentTimeMillis()-startTime1);

        System.out.println(sum1);
    }
}
