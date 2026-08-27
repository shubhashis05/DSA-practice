class MyQueue {
Stack<Integer> input ;
Stack<Integer> output ;
    public MyQueue() {
        input = new Stack<>();
        output = new Stack<>();
    }
    
    public void push(int x) {
        input.push(x);
    }
    
    public int pop() {
        while(!input.isEmpty())
            output.push(input.pop());
        int val = output.pop();
        while(!output.isEmpty())
            input.push(output.pop());
        return val;
    }
    
    public int peek() {
        while(!input.isEmpty())
            output.push(input.pop());
        int val = output.peek();
        while(!output.isEmpty())
            input.push(output.pop());
        return val;
    }
    
    public boolean empty() {
        if(input.isEmpty()) return true;
        return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */