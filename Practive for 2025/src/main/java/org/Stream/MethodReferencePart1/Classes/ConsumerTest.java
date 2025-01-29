package org.Stream.MethodReferencePart1.Classes;

import org.Stream.MethodReferencePart1.interfaces.IUpperCase;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class ConsumerTest {
    public static void main(String[] args) {
    List<Integer> list = Arrays.asList(13, 22, 33, 42, 15, 46, 7, 18, 39, 10);

        Consumer<List<Integer>> sort = Collections::sort;
        sort.accept(list);
        System.out.println(list);

        BiFunction<Integer, Integer, Integer> sum = ConsumerTest::mul;

        Integer sum1 =sum.apply(10,10);

        System.out.println(sum1);


        BiFunction <String, String, Boolean> checkIfEqual= Objects::equals;
        boolean checkIfEqual1 =checkIfEqual.apply("abc","abc");

        System.out.println(checkIfEqual1);


        Function<Object, Integer> calculateHash = Objects::hashCode;

        int hash = calculateHash.apply(new ConsumerTest());
        System.out.println(hash) ;

        Consumer<Object> hashed = Objects::hashCode;

        hashed.accept(new ConsumerTest());

        Consumer<String> hashed2 = System.out::println;
        hashed2.accept("abc");


        IUpperCase upperCase = String::toUpperCase;
        String convert = upperCase.converToUpperCase("bhuvanesh");
        System.out.println(convert );










    }
    static int mul(int a, int b) {
        return a * b;
    }
}
