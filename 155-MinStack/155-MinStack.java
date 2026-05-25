// Last updated: 5/25/2026, 11:57:35 PM
1class MinStack {
2    Stack<Integer> st;
3    Stack<Integer> minst;
4    public MinStack() {
5        st=new Stack<>();
6        minst=new Stack<>();
7    }
8    
9    public void push(int val) {
10        st.push(val);
11        if(minst.empty()) minst.push(val);
12        else minst.push(Math.min(minst.peek(),val));
13    }
14    
15    public void pop() {
16        st.pop();
17        minst.pop();
18    }
19    
20    public int top() {
21        return st.peek();
22    }
23    
24    public int getMin() {
25        return minst.peek();
26    }
27}
28
29/**
30 * Your MinStack object will be instantiated and called as such:
31 * MinStack obj = new MinStack();
32 * obj.push(val);
33 * obj.pop();
34 * int param_3 = obj.top();
35 * int param_4 = obj.getMin();
36 */