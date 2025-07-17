package javaTraining.DataStructureAlgorithm.List;

public class Runner {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(5);
        list.insert(10);
        list.insert(15);
        list.inserAtStart(4);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insertAt(2,11);
        list.insertAt(0,12);
        list.delete(12);
        list.deleteAt(5);
        list.display();
    }
}
