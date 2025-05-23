package org.Stream.MethodReferencePart2.Classes;

import org.Stream.MethodReferencePart2.empolyee.Employee;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Consumer;
import java.util.function.Function;

public class StringClass {
    public static void main(String[] args) {
        List<String> list = List.of("Bhuvanesh","vijay","kavi","kamal","Sethu");

        Consumer<Integer> stringConsumer = System.out::println;
        Function<Employee, Integer > function = Employee :: getId;

        Integer name = function.apply(new Employee("Bhuvanesh",16));
        stringConsumer.accept(name);

        list.stream()
                .map(Employee::new)
                .map(employee1 -> {
                    employee1.setId(ThreadLocalRandom.current().nextInt());
                    return employee1;
                })
                .map(employee1 -> employee1.getName())
                .forEach(System.out::println);
    }
}
