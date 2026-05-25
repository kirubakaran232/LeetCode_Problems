// Last updated: 5/25/2026, 7:16:12 PM
class Solution {
    public int[] canSeePersonsCount(int[] h) {
        int n = h.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            int c = 0;
            while(!st.isEmpty() && st.peek()<h[i]){
                st.pop();
                c++;
            }
            if(!st.isEmpty()){
                c++;
            }
            res[i] = c;
            st.push(h[i]);
        }
        return res;
    }
}
