class MinStack {
    Stack<Integer> st;
    Stack<Integer> minStack;

    public MinStack() {
        st = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int value) {
        st.push(value);

        if (minStack.isEmpty() || minStack.peek() >= value) {
            minStack.push(value);
        }
    }

    public void pop() {
        if (st.peek().equals(minStack.peek())) {
            minStack.pop();
        }

        st.pop();
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}