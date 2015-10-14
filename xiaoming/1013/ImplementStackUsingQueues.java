import java.util.*;


public class ImplementStackUsingQueues {
	
	private LinkedList<Integer> queue1;
	
	ImplementStackUsingQueues() { 
		queue1 = new LinkedList<Integer>();
	}

	// Push element x onto stack.
    public void push(int x) {
        queue1.addFirst(x);;
    }

    // Removes the element on top of the stack.
    public void pop() {
    	queue1.poll();
    }

    // Get the top element.
    public int top() {
        return queue1.peek();
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return queue1.isEmpty();
    }
}
