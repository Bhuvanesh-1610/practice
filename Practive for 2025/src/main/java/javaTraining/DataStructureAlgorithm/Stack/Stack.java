package javaTraining.DataStructureAlgorithm.Stack;

public class Stack {

    int stack[] = new int[5];
    int top = 0;

    public void push(int value) {
        stack[top] = value;
        top++;
    }
    public int pop() {
        int data;
        top--;
        data = stack[top];
        stack[top] = 0;
        return data;
    }

    public int size(){
        return top;
    }

    public int peek() {
        int data = top-1;
        return stack[data];
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public void display(){
        for(int i = top-1; i >= 0; i--){
            System.out.print(stack[i] + " ");
        }
    }
}
