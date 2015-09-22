class MinStack {
    
    private Stack<Integer> allStack = new Stack();
    private Stack<Integer> minStack = new Stack();
    
    public void push(int x) {
        allStack.push(x);
        if (minStack.isEmpty() || x < minStack.peek()){
            minStack.push(x);
        }else{
            minStack.push(minStack.peek());
        }
    }

    public void pop() {
        allStack.pop();
        minStack.pop();
    }

    public int top() {
        return allStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
