// Last updated: 5/25/2026, 7:17:47 PM
class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        int score = 0;
        for(int i=0;i<s.length();i++){
            char p = s.charAt(i);
            if(p=='('){
                st.push(score);
                score = 0;
            }else{
                score = st.pop() + Math.max(2*score,1);
            }
        }
        return score;
    }
}