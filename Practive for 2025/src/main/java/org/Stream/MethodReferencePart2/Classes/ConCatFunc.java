package org.Stream.MethodReferencePart2.Classes;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class ConCatFunc {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "world";
        String result1 = str1.concat(str2);

        System.out.println(result1);

        BiFunction<String, String, String> concat = String::concat;
        String result2 = concat.apply("Bhuvanesh", "waran S");
        System.out.println(result2);

        Function<String, String> name = String::toUpperCase;
        String resName = name.apply("Bhuvaneshwaran s");
        System.out.println(resName);
    }
}
