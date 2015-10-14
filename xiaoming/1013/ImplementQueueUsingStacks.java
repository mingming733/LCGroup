import java.util.Stack;


public class ImplementQueueUsingStacks {

}

class MyQueue {
    
    private Stack<Integer> stackIn;
    private Stack<Integer> stackOut;
    
    MyQueue() {
        stackIn = new Stack<Integer>(); 
        stackOut = new Stack<Integer>();}
    // Push element x to the back of queue.
    void push(int x) {
        stackIn.push(x);
    }

    // Removes the element from in front of queue.
    void pop() {
        if (stackOut.isEmpty()) {
            while (!stackIn.isEmpty())
            stackOut.push(stackIn.pop());
        }
        stackOut.pop();
    }

    // Get the front element.
    int peek() {
        if (stackOut.isEmpty()) {
            while (!stackIn.isEmpty())
            stackOut.push(stackIn.pop());
        }
        int temp = stackOut.pop();
        stackOut.push(temp);
        return temp;
    }

    // Return whether the queue is empty.
    boolean empty() {
        return stackIn.isEmpty() && stackOut.isEmpty();
    }
}
