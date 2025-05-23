package org.Stream.MethodReferencePart2.Classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.BiConsumer;

public class ArrayListFunc {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        BiConsumer <ArrayList<Integer>, Integer> add = ArrayList::add;
        add.accept(list, 11);
        add.accept(list, 12);
        System.out.println(list);
    }
}
