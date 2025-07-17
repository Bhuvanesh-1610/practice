package javaTraining.DataStructureAlgorithm.Tree;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(8);
        tree.insert(7);
        tree.insert(9);
        tree.insert(6);
        tree.insert(15);
        tree.insert(14);
        tree.insert(16);
        tree.insert(5);
        tree.insert(40) ;
     //   tree.inOrder();

        tree.preOrder();
    }
}
