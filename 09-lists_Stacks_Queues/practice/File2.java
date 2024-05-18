public class File2 {

    //* This file has doubly linked list

    public static void main(String[] args) {
        DoublyLL list = new DoublyLL();
        list.insertFirst(100);
        list.insertFirst(23);
        list.insertFirst(44);
        list.insertFirst(435);
        list.insertLast(123);
        list.insert(989, 2);
        list.insert(234, 2);
        list.deleteFirst();
        list.deleteLast();
        list.delete(2);
        list.displayList();
        list.displayListReverse();
    }
    
}
class DoublyLL{

    private Node head;
    private Node tail;
    int size;
    public DoublyLL(){
        this.size = 0;
    }

    public void displayList(){
        System.out.println("Size : " + this.size);
        Node tempHead = head;
        while (tempHead != null){
            System.out.print(tempHead.val + " -> ");
            tempHead = tempHead.next;
        }
        System.out.println("End");
    }

    public void displayListReverse(){
        Node tempTail = this.tail;
        System.out.print("End");
        while(tempTail != null){
            System.out.print(" <- " + tempTail.val);
            tempTail = tempTail.prev;
        }
        System.out.println();
    }
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = this.head;
        if (this.head != null){
        this.head.prev = node;
        }
        this.head = node;
        this.head.prev = null;
        if (this.tail == null){
            this.tail = this.head;
        }
        size++;
    }
    public void insertLast(int val){
        if (size == 0){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        this.tail.next = node;
        node.prev = this.tail;
        this.tail = node;
        size++;
    }
    public void insert(int val, int index){

        if (index == 0){
            insertFirst(val);
            return;
        }
        if (index == size - 1){
            insertLast(val);
            return;
        }
        Node newNode = new Node(val);
        Node prevNode = getNode(index - 1);
        newNode.prev = prevNode;
        newNode.next = prevNode.next;
        prevNode.next = newNode;
        newNode.next.prev = newNode;
        size++;
    }

    public int deleteFirst(){
        int value = head.val;
        head = head.next;
        if (head == null){
            tail = null;
        }
        else{
        head.prev = null;
        }
        size--;
        return value;
    }
    public int deleteLast(){
        int value = tail.val;
        if (size == 1){
            return deleteFirst();
        }
        tail = tail.prev;
        tail.next = null;
        size--;
        return value;
    }
    public int delete(int index){
        if (index == 0){
            return deleteFirst();
        }
        if (index == size - 1){
            return deleteLast();
        }

        Node prevNode = getNode(index - 1);
        int value = prevNode.next.val;
        prevNode.next = prevNode.next.next;
        prevNode.next.prev = prevNode;
        size--;
        return value;
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
        Node prev;
        public Node(int val){
            this.val = val;
        }
        public Node(int val, Node next, Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
