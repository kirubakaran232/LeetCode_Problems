// Last updated: 6/16/2026, 6:29:04 PM
1class Solution {
2    public String decodeString(String s) {
3        Stack<Character> st = new Stack<>();
4        StringBuilder res = new StringBuilder();
5        for(int i=0;i<s.length();i++){
6            char ch = s.charAt(i);
7            if(ch!=']'){
8                st.push(ch);
9            }else{
10                StringBuilder sb = new StringBuilder();
11                while(!st.isEmpty() && st.peek()!='['){
12                    sb.append(st.pop());
13                }
14                st.pop();
15                sb.reverse().toString();
16                if(!st.isEmpty() && Character.isDigit(st.peek())){
17                    StringBuilder numStr = new StringBuilder();
18                    while (!st.isEmpty() && Character.isDigit(st.peek())) {
19                        numStr.append(st.pop());
20                    }
21                    numStr.reverse();
22                    int num = Integer.parseInt(numStr.toString());
23                    while(num>0){
24                        for(int j=0;j<sb.length();j++){
25                            st.push(sb.charAt(j));
26                        }
27                        num--;
28                    }
29                }else{
30                    for(int j=0;j<sb.length();j++){
31                        st.push(sb.charAt(j));
32                    }
33                }
34            }
35        }
36        while(!st.isEmpty()){
37            res.append(st.pop());
38        }
39        return res.reverse().toString();
40    }
41}