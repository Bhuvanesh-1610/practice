package javaTraining.OOPS;

public class Addition {
    public int add(int a, int b) {
        return a + b;
    }

    public String add(String a, int b) {
        return a + b ;
    }

    public static void sub(int a, int b){
        System.out.println(a-b);
    }



    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        Addition addition = new Addition();

        int c = addition.add(a,b);
        System.out.println(addition.add("abc",30));

        System.out.println(c);

        sub(a,b);
    }
}
