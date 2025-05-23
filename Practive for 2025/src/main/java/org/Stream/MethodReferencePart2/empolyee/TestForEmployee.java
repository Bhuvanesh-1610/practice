package org.Stream.MethodReferencePart2.empolyee;

import java.util.ArrayList;
import java.util.function.BiFunction;


public class TestForEmployee {
    public static void main(String[] args) {
        BiFunction<String, Integer, Employee> empolyeeCalling= Employee::new;
        ArrayList<Employee> employees = new ArrayList<>();
        for(int i=0;i<10;i++){
            employees.add(empolyeeCalling.apply("Bhuvanesh",1));
        }
        employees.add(empolyeeCalling.apply("Sethu",2));
        System.out.println(employees.stream().distinct().count());


    }
}
