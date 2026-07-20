class MyStack {
    //establish vars
    private Queue<Integer> q1;
    private Queue<Integer> q2;

    public MyStack() {
        //standard constructorsx
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }
    
    public void push(int x) {
        //empty q2, add it there
        q2.offer(x);

        //append the entirety of the q1 LL to q2 after the head
        while(!q1.isEmpty()) {
            q2.offer(q1.poll());
        }
        Queue<Integer> temp = q1;       //q1 is empty
        q1 = q2;                        //swap to main queue (q1)
        q2 = temp;                      //make q2 empty
    }
    
    public int pop() {
        return q1.poll();
    }
    
    public int top() {
        return q1.peek();
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */