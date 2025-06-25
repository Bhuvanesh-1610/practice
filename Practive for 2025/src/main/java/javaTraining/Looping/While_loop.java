package javaTraining.Looping;

public class While_loop {
    public static void main(String[] args) {
        int number =1;
        while (number < 10) {
            System.out.println(number);
            number++;
            break;
        }
        System.out.println(++number);
        System.out.println(number);
    }
}
