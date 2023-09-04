public class File3 {
    // * This file contains circular Linked List
    public static void main(String[] args) {
        CircularLL list = new CircularLL();
        list.insertLast(100);
        list.insertLast(110);
        list.insertLast(120);
        list.insertLast(130);
        list.displayList();
    }
}
class CircularLL{
    private Node head;
    private Node tail;
    int size;

    public CircularLL(){
        this.size = 0;
    }

    public void displayList(){
        //* Tip: you can also do this using do-while loop
        System.out.println("Size : " + size);
        Node tempHead = head;
        while (tempHead.next != head){
            System.out.print(tempHead.val + " -> ");
            tempHead = tempHead.next;
        }
        System.out.println(tempHead.val + " -> END");
    }
    public void insertLast(int val){
        Node newNode = new Node(val);
        if (head == null){
            head = newNode;
            tail = newNode;
            tail.next = head;
            size++;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        tail.next = head;
        size++;
    }


    public Node getNode(int index){
        Node tempHead = head;
        for (int i = 0; i < index; i++){
            tempHead = tempHead.next;
        }
        return tempHead;
    }

    class Node{
        int val;
        Node next;
        public Node(int val){
            this.val = val;
        }
        public Node(int val, Node next){
            this.val = val;
            this.next = next;
        }
    }
}
