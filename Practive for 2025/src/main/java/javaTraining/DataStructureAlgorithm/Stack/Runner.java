package javaTraining.DataStructureAlgorithm.Stack;

public class Runner {
    public static void main(String[] args) {
        Stack numbs = new Stack();
//        numbs.push(15);
//        numbs.push(10);
//        numbs.push(5);
//        numbs.push(3);
//        numbs.push(2);
boolean isEmpty = numbs.isEmpty();
        System.out.println(numbs.size());
//        System.out.println(numbs.peek());
        if(isEmpty){
            System.out.println("Stack is empty");
        }
        numbs.display();
    }
}
