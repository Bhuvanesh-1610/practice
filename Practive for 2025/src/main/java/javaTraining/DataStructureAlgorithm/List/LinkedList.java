package javaTraining.DataStructureAlgorithm.List;

public class LinkedList {
        Node head;
        public void insert(int data) {
            Node node = new Node();
            node.data = data;
            node.next =null;

            if (head == null) {
                head = node;
            }
            else{
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = node;
            }
        }

        public void inserAtStart(int data) {
            Node node = new Node();
            node.data = data;
            node.next = head;
            head = node;
        }

        public void insertAt(int index, int data) {
            Node node = new Node() ;
            node.data = data;
            node.next = null;
            if (index == 0) {
                inserAtStart(data);
            }
            else {

                Node temp = head;
                for (int i = 0; i < index - 1; i++) {
                    temp = temp.next;
                }

                node.next = temp.next;
                temp.next = node;

            }
        }

        public void deleteAt(int index) {
            Node temp = head;
            if (index == 0) {
                head = head.next;
            }
            else{
                for (int i = 0; i < index - 1; i++) {
                    temp = temp.next;
                }
                temp.next = temp.next.next;
                System.out.println("Deleted data: " + temp.next.data);
            }
        }

        public void delete(int data) {
            Node temp = head;
            if (head.data == data) {
                head = head.next;
            }
            else {
                while (temp.next.data != data) {
                    temp = temp.next;
                }
                temp.next = temp.next.next;
            }
        }

        public void display() {
            Node temp = head;
            while(temp.next != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
            System.out.println(temp.data);
        }

}
