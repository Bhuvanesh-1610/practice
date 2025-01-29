package org.Stream.MethodReferencePart2.Classes;

import org.Stream.MethodReferencePart1.interfaces.IUpperCase;

public class UpperCaseTest {
    public static void main(String[] args) {
        IUpperCase iUpperCase =new UpperCaseTest()::converToUpperCases ;
        System.out.println(iUpperCase.converToUpperCase("oiasdjgo"));
    }


    String converToUpperCases(String str) {
        return str.toUpperCase();
    }
}
