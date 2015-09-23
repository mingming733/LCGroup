import java.util.*;


public class implementQueueByTwoStacks {
	public static void main(String[] args) {
		QueueNew newQueue = new QueueNew();
		newQueue.push(22);
		newQueue.push(15);
		newQueue.push(3);
		newQueue.push(50);
		
		System.out.println(newQueue.top() + "");
		System.out.println(newQueue.pop() + "");
		
		System.out.println(newQueue.top() + "");
		System.out.println(newQueue.pop() + "");
		
		System.out.println(newQueue.top() + "");
		System.out.println(newQueue.pop() + "");
		
		newQueue.push(10000);
		newQueue.push(30000);
		newQueue.push(50000);
		
		System.out.println(newQueue.top() + "");
		System.out.println(newQueue.pop() + "");
		
		System.out.println(newQueue.top() + "");
		System.out.println(newQueue.pop() + "");
		
		System.out.println(newQueue.top() + "");
		System.out.println(newQueue.pop() + "");

	
	}

}


class QueueNew {
	
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    QueueNew() {
    	stack1 = new Stack<Integer>() ;
    	stack2 = new Stack<Integer>() ;
    }	    

    void push(int element) {
    	try {
        stack2.push(element);}
    	catch (Exception excp) { System.out.println("Wrong push!!");}
    }
    
    int pop() {
    	if (stack1.isEmpty())
    		while ( ! stack2.isEmpty()) 
    			stack1.push(stack2.pop());
    	if ( ! stack1.isEmpty())
    		return stack1.pop();
    	else {
    		System.out.println("Was empty!!!");
    		return -1111111111;
    	}		
    }

    int top() {
    	if (stack1.isEmpty())
    		while ( ! stack2.isEmpty()) 
    			stack1.push(stack2.pop());
    	if ( ! stack1.isEmpty()) {
    		int temp = stack1.pop();
    		stack1.push(temp);
    		return temp;
    	}
    	else {
    		System.out.println("Was empty!!!");
    		return -1111111111;
    	}				    }
}