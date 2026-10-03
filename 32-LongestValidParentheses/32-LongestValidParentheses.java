// Last updated: 10/3/2026, 9:42:58 PM
1class Solution {
2    public int longestValidParentheses(String s) {
3        Stack<Integer> stack = new Stack<>();
4        stack.push(-1);
5        int max = 0;
6        for (int i = 0; i < s.length(); i++) {
7            if (s.charAt(i) == '(') {
8                stack.push(i);
9            } else {
10                stack.pop();
11                if (stack.isEmpty()) {
12                    stack.push(i);
13                } else {
14                    max = Math.max(max, i - stack.peek());
15                }
16            }
17        }
18        return max;        
19    }
20}