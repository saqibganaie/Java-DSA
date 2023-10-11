import java.util.Stack;

public class File4 {
    // This file contains info about stacks and queues.
    // If you want more info about stacks and queues you can visit 
    // * For Stack - https://www.geeksforgeeks.org/stack-data-structure/?ref=lbp
    // * For Queue - https://www.geeksforgeeks.org/queue-data-structure/
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        myStack.push(10);
        myStack.push(32);
        myStack.push(56);
        int stackSize = myStack.size();
        for(int i = 0; i < stackSize; i++){
            System.out.println(myStack.pop());
        }
    }
}
