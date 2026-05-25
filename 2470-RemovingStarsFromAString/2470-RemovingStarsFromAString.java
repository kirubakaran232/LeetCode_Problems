// Last updated: 5/25/2026, 7:11:15 PM
class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!st.isEmpty()&&s.charAt(i)=='*'){
                st.pop();
            }else{
                st.push(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.peek());
            st.pop();
        }
        return sb.reverse().toString();
    }
}