package javaTraining.Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        int[][] multiDimensionalArray = new int[3][5];
        int i=0;
        int j=0;
        int k=0;
        for (i=0; i<multiDimensionalArray.length; i++) {
            for (j=0; j<multiDimensionalArray[i].length; j++) {
                multiDimensionalArray[i][j] = k++;
            }
        }

        for (i=0; i<multiDimensionalArray.length; i++) {
            for (j=0; j<multiDimensionalArray[i].length; j++) {
                System.out.print(multiDimensionalArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
