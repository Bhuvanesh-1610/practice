package javaTraining.Arrays;

public class PrimeNumbers {
    public static void main(String[] args) {
        Boolean isNotPrime = false;
        for (int i = 2; i < 100; i++) {
            isNotPrime = false;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isNotPrime = true;
                    System.out.println(" number " + i +" is not prime" );
                 break;
                }
            }
            if (!isNotPrime) {
                System.out.println(" number " + i +" is prime" );
            }
        }
    }
}
