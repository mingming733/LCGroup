import java.util.*;

public class minStack {
	
	public static void main(String[] args) {
		MinStackA stack = new MinStackA();
		stack.push(22);
		stack.push(15);
		stack.push(3);
		stack.push(50);
		stack.push(15);
		stack.push(3);
		stack.push(100);
		
		System.out.println(stack.getMin() + "");
		System.out.println(stack.top() + "");
		stack.pop();
		stack.pop();
		stack.pop();

		System.out.println(stack.getMin() + "");
		System.out.println(stack.top() + "");
		stack.pop();
		stack.pop();
		stack.pop();
		
		System.out.println(stack.getMin() + "");
		System.out.println(stack.top() + "");
		stack.pop();
		stack.pop();
		stack.pop();
		
		System.out.println(stack.getMin() + "");
		System.out.println(stack.top() + "");
	}

}


class MinStackA {
	
	private LinkedList<Integer> stack;
	private LinkedList<Integer> min;
	
	MinStackA()  {
		stack = new LinkedList<Integer>() ; 
		min = new LinkedList<Integer>(); }
	
    public void push(int x) {
    	try{
    	stack.add(x);
    	if (min.isEmpty() || x <= min.getLast())
    		min.add(x);
    	} catch(Exception ex) {}
    }

    public void pop() {
    	if (stack == null || stack.isEmpty()) return;
    	int temp = stack.removeLast();
        if (temp == min.getLast())   min.removeLast();
    }

    public int top() {
    	
        if (stack == null || stack.isEmpty()) return -1;
        return stack.getLast();
    }

    public int getMin() {
    	try {
    	if (min.isEmpty()) return -1;
        return min.getLast();
    	} catch(Exception ex) { return -1;}
    }
}