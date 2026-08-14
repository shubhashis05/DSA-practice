class MinStack {
    Stack<Integer> st ;
    Stack<Integer> minStack ;

    public MinStack() {
        st = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int value) {
        st.push(value);
        if(minStack.isEmpty() || minStack.peek() >= value) minStack.push(value);
    }
    
    public void pop() {
        if(!st.isEmpty()){
            if(st.peek().equals(minStack.peek())) minStack.pop();
            st.pop();
        }   
    }
    
    public int top() {
        if(st.isEmpty()) return -1;
        return st.peek();
    }
    
    public int getMin() {
        if(minStack.isEmpty()) return -1;
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */