package javaTraining.DataStructureAlgorithm.Queue;

public class Runner {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        queue.dequeue();

        queue.dequeue();
        queue.enqueue(5);
        queue.enqueue(6);

        System.out.println("size " + queue.getSize());
        queue.printQueue();
    }
}