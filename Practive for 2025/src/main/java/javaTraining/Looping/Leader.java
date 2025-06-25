package javaTraining.Looping;

public class Leader {
    public static void main(String[] args) {
        int arr [] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*10);
        }
        int n = arr.length;
        int maxFromRight =arr[n-1];
        System.out.println(maxFromRight);

        for (int i = arr.length-2; i >=0; i--) {
            if (arr[i] > arr[i+1]) {
                maxFromRight = arr[i];
                System.out.println(maxFromRight);
            }
        }
        System.out.println();
        for(int i: arr) System.out.println(i);
    }
}
