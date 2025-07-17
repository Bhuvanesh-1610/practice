package javaTraining.DataStructureAlgorithm.Tree;

class Node{
    int data;
    Node left;
    Node right;

    public Node(int data){
        this.data = data;
    }
}

public class BinaryTree {
    Node root;
    public void insert(int data) {
       root=insertRec(root,data);
    }

    public Node insertRec(Node root, int data) {
        if(root == null) root = new Node(data);
        else if (data <root.data) root.left = insertRec(root.left,data);
        else if (data > root.data) root.right = insertRec(root.right,data);

        return root;
    }

    public void inOrderTraversal(Node root) {
        if(root == null) return;
        inOrderTraversal(root.left);
        System.out.print(root.data + " ");
        inOrderTraversal(root.right);
    }

    public void inOrder(){
        inOrderTraversal(root);
    }

    public void preOrder(){
        preOrderTraversal(root);
    }

    public void preOrderTraversal(Node root){
        if(root == null) return;
        System.out.print(root.data + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
}
