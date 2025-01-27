package org.Stream;

import org.Stream.interfaces.Isum;

public class Sum {
    public static void main(String[] args) {
        Isum isum = new Isum(){
            @Override
            public int sum(int a, int b) {
                return a + b;
            }
        };
        int sum = isum.sum(1,2);
        System.out.println(sum);

        Isum lambda = (a, b) -> a + b;
        int sum2 = lambda.sum(10,2);

        System.out.println(sum2);

        Isum isum2 = Integer::sum;
        int sum3= isum2.sum(1,20);

        System.out.println(sum3);

    }
    public static int addditon(int a, int b) {
        return a + b;
    }
}
