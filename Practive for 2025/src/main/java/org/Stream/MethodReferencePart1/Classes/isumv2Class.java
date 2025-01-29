package org.Stream.MethodReferencePart1.Classes;

import org.Stream.MethodReferencePart1.interfaces.ISumV2;

public class isumv2Class {
    public static void main(String[] args) {
        ISumV2 iSumV2 = Integer::sum;
        iSumV2.sum(2,4);
    }
}
