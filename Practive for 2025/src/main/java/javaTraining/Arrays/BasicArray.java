package javaTraining.Arrays;

import java.sql.Array;

public class BasicArray {
    public static void main(String[] args) {
       String[] cars = new String[5];
       cars[0] = "Bugatti";
       cars[1] = "Honda";
       cars[2] = "Ford";
       cars[3] = "Mazda";
       cars[4] = "Renault";

 String replaceWord ="Mazda";
        for( int i = 0; i<cars.length ;i++) {
            String car = cars[i];
            if(replaceWord.equals(car)) {
                cars[i] ="Maruthi";
            }
            System.out.println(car);
        }

        for(String car : cars) {
            System.out.println(car);
        }


    }
}
