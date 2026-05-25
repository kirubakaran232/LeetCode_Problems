// Last updated: 5/25/2026, 7:11:18 PM
class Solution {
    public String smallestNumber(String pattern) {
        StringBuilder sb = new StringBuilder();
        Stack<Integer> st = new Stack<>();
        int num = 1;
        for (int i = 0; i <= pattern.length(); i++) {
            st.push(num++);
            if (i == pattern.length() || pattern.charAt(i) == 'I') {
                while (!st.isEmpty()) {
                    sb.append(st.pop());
                }
            }
        }
        return sb.toString();
    }
}
