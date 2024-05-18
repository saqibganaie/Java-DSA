public class File1{
    // This file contains info about Linked Lists. 
    // To read about Linked lists go to (tip : You can directly go to the link web page by pressing 'ctrl + click' on it) https://www.geeksforgeeks.org/what-is-linked-list//

    // * There is only singly linked list in this file.
    public static void main(String[] args){
        LinkedList list1 = new LinkedList();
        list1.insertFirst(19);
        list1.insertFirst(1);
        list1.insertFirst(10);
        list1.insertFirst(5);
        list1.insertLast(100);
        list1.insertFirst(50);
        list1.insertLast(200);
        list1.insert(123, 3);
        list1.deleteFirst();
        list1.deleteLast();
        list1.delete(2);
        list1.displayList();    
    }
}

class LinkedList{
    private Node head;
    private Node tail;
    private int size;
    public LinkedList(){
        this.size = 0;
    }
    public void displayList(){
        System.out.println("Size = " + this.size);
        Node tempHead = this.head;
        while(tempHead != null){
            System.out.print(tempHead.val + " -> ");
            tempHead = tempHead.next;
        }
        System.out.println("END");
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        this.head = node;
        if (tail == null){
            tail = head;
        }
        size ++;
    }
    public void insertLast(int val){
        if (this.tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        this.tail.next = node;
        this.tail = node;
        size++;
    }

    public void insert(int val, int index){
        if (index == 0){
            insertFirst(val);
            return;
        }
        if (index == this.size){
            insertLast(val);
            return;
        }
        Node tempHead = this.head;
        for (int i = 1; i < index; i++){
            tempHead = tempHead.next;
        }
        Node node = new Node(val, tempHead.next);
        tempHead.next = node;
        size++;
    }


    public int deleteFirst(){
        int deletedVal = this.head.val;
        this.head = head.next;
        if (head == null){
            this.tail = null;
        }
        this.size--;
        return deletedVal;
    }

    public int deleteLast(){
        int deletedVal = this.tail.val;
        Node secondLast = getNode(this.size - 2);
        secondLast.next = null;
        this.tail = secondLast;
        this.size--;
        return deletedVal;
    }

    public int delete(int index){
        if (index == 0){
            return deleteFirst();
        }
        Node prevNode = getNode(index - 1);
        int val = prevNode.next.val;
        prevNode.next = prevNode.next.next;
        size--;
        return val;
    }

    public Node getNode(int index){
        Node tempHead = this.head;
        for (int i = 0; i < index; i++){
            tempHead = tempHead.next;
        }
        return tempHead;
    }

    public class Node{
        private int val;
        private Node next;
        public Node(int val){
            this.val = val; // In this next will be null so that this can be used to make the tail node in which the next node points to null.
        }
        public Node(int val, Node next){
            this.val = val;
            this.next = next;
        }
    }
}