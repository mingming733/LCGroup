public class Solution {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public Solution() {
       stack1 = new Stack<Integer>();
       stack2 = new Stack<Integer>();
    }
    
    public void push(int element) {
        if(stack2.empty()) {
            stack1.push(element);
        } else {
            while(!stack2.empty()) {
                stack1.push(stack2.peek());
                stack2.pop();
            }
            stack1.push(element);
        }
    }

    public int pop() {
        int i = 0;
        if(stack2.empty()) {
            while(!stack1.empty()) {
                stack2.push(stack1.peek());
                stack1.pop();
            }
            i = stack2.peek();
            stack2.pop();
        } else {
            i = stack2.peek();
            stack2.pop();
        }
        return i;
    }

    public int top() {
        if(stack2.empty() && stack1.empty()) {
            return 0;
        } else if(stack2.empty()) {
            while(!stack1.empty()) {
                stack2.push(stack1.peek());
                stack1.pop();
            }
            return stack2.peek();
        } else if(stack1.empty()) {
            return stack2.peek();
        } else {
            return 0;
        }
        // write your code here
    }
}