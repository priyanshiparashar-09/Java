package Collections;


import java.util.Stack;

public class MyQueue {
    private Stack<Integer> stackNewest, stackOldest;

    public MyQueue() {
        stackNewest = new Stack<>();
        stackOldest = new Stack<>();
    }

    public void push(int x) {
        stackNewest.push(x);
    }

    private void shiftStacks() {
        if (stackOldest.isEmpty()) {
            while (!stackNewest.isEmpty()) {
                stackOldest.push(stackNewest.pop());
            }
        }
    }

    public int pop() {
        shiftStacks();
        return stackOldest.pop();
    }

    public int peek() {
        shiftStacks();
        return stackOldest.peek();
    }

    public boolean empty() {
        return stackNewest.isEmpty() && stackOldest.isEmpty();
    }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.push(1);
        queue.push(2);
        System.out.println("Peek element: " + queue.peek()); // Returns 1
        System.out.println("Remove element: " + queue.pop()); // Returns 1
        System.out.println("Is queue empty? " + queue.empty()); // Returns false
    }
}