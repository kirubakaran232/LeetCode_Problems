// Last updated: 5/25/2026, 7:16:16 PM
class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=')') st.push(s.charAt(i));
            if(s.charAt(i)==')'){
                StringBuilder temp = new StringBuilder();
                while(st.peek()!='('){
                    temp.append(st.pop());
                }
                st.pop();
                for(int j=0; j<temp.length(); j++){
                    st.push(temp.charAt(j));
                }
            }
        }
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}