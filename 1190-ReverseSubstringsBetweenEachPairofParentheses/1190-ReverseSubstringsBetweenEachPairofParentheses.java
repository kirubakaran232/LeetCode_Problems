// Last updated: 9/27/2026, 11:52:29 AM
1class Solution {
2    public String reverseParentheses(String s) {
3        Stack<Character> st = new Stack<>();
4        StringBuilder sb = new StringBuilder();
5        for(int i=0;i<s.length();i++){
6            if(s.charAt(i)!=')') st.push(s.charAt(i));
7            if(s.charAt(i)==')'){
8                StringBuilder temp = new StringBuilder();
9                while(st.peek()!='('){
10                    temp.append(st.pop());
11                }
12                st.pop();
13                for(int j=0; j<temp.length(); j++){
14                    st.push(temp.charAt(j));
15                }
16            }
17        }
18        while(!st.isEmpty()){
19            sb.append(st.pop());
20        }
21        return sb.reverse().toString();
22    }
23}