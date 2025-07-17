package javaTraining.DataStructureAlgorithm.Queue;

public class Queue {
    int queue [] = new int [5];
    int size;
    int front;
    int rear;
    public void enqueue(int data) {
        queue[rear] = data;
        rear = (rear+1)%5;
        size = size + 1;
    }

    public int dequeue() {
            int data = queue[front];
            front = front + 1;
            size = size - 1;
            return data;
    }

    public void printQueue() {
        for(int x = 0; x < size; x++) {
            System.out.print(queue[(front+x)%queue.length] + " ");
        }
        System.out.println();
        for(int n : queue){
            System.out.print(n + " ");
        }
    }

    public int getSize(){
        return size;
    }
}
