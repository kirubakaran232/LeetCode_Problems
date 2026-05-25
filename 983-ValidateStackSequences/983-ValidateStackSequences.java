// Last updated: 5/25/2026, 7:17:24 PM
class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st = new Stack<>();
        int j = 0;
        for(int i : pushed){
            st.push(i); 
            while(!st.isEmpty() && st.peek() == popped[j]){ 
                st.pop(); 
                j++;
            }
        }
        return st.isEmpty(); 
    }
}