package org.Stream.MethodReferencePart1.Classes;

import org.Stream.MethodReferencePart1.interfaces.IPrint;

public class PrintTest {
    public static void main(String[] args) {
        String name = "bhuvanesh...";
        IPrint print = PrintTest::print;
        System.out.println(print.printData(name)+" 123");
    }


    public static String print(String string){
        System.out.println(string);
        return string;
    }

}
