// Last updated: 7/27/2026, 11:04:25 AM
1class Solution {
2    public int clumsy(int n) {
3        Stack<Integer> st = new Stack<>();
4        int ind = 0,res = 0;
5        st.push(n);
6        for(int i=n-1;i>0;i--){
7            if(ind==0){
8                st.push(st.pop()*i);
9                ind++;
10            }else if(ind==1){
11                st.push(st.pop()/i);
12                ind++;
13            }else if(ind==2){
14                st.push(i);
15                ind++;
16            }else{
17                st.push(-i);
18                ind = 0;
19            }
20        }
21        while(!st.isEmpty()){
22            res+=st.pop();
23        }
24        return res;
25    }
26}
27