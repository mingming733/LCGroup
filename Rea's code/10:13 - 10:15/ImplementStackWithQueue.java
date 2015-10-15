import java.util.LinkedList;
import java.util.Queue;
public class ImplementStackWithQueue {
	private Queue<Integer> q1 = new LinkedList<>();
	private Queue<Integer> q2 = new LinkedList<>();
	
	//push element x onto Stack;
	public void push(int x){
		q1.offer(x);
	}
	//remove the element on top of the stack
	public void pop(){
		while (q1.size() > 1){
			q2.offer(q1.poll());
		}
		q1.poll();
		Queue temp = q1;
		q1 = q2;
		q2 = temp;
	}
	
	//get the top element
	public int top(){
		while (q1.size() > 1){
			q2.offer(q1.poll());
		}
		int top = q1.peek();
		q2.offer(q1.poll());
		Queue temp = q1;
		q1 = q2;
		q2 = temp;
		return top;
	}
	//return whether the stack is empty
	public boolean empty(){
		return q1.isEmpty();
	}
}
