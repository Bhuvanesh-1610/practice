package org.Stream.MethodReferencePart2.Classes;

import org.Stream.MethodReferencePart2.Interfaces.IAdditon;

public class Addition {
     int doAddition(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        Addition addition = new Addition();
        addition.doAddition(1, 2);

        IAdditon additon1 =  Addition::doAddition;
        System.out.println(additon1.sum(new Addition(),15,43));
    }
}
