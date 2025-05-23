package org.Stream.BoxingAndUnBoxing.Classes;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Sync {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 105; i++) {
            list.clear();
            Stream.iterate(1, num -> num <= 20, num -> num + 1)
                            .parallel().forEach(num ->{
                                list.add(num);
                        System.out.println(list.stream().isParallel());
                    });

        }

    }
}
