// Last updated: 6/1/2026, 11:45:32 AM
1class Solution {
2    public int evalRPN(String[] t) {
3        Stack<Integer> st = new Stack<>();
4        for(String s:t){
5            if(s.equals("+")){
6                st.push(st.pop()+st.pop());
7            }else if(s.equals("-")){
8                int sec = st.pop();
9                int fir = st.pop();
10                st.push(fir - sec);
11            }else if(s.equals("*")){
12                st.push(st.pop()*st.pop());
13            }else if(s.equals("/")){
14                int sec = st.pop();
15                int fir = st.pop();
16                st.push(fir / sec);
17            }else{
18                st.push(Integer.parseInt(s));
19            }
20        }
21        return st.peek();
22    }
23}