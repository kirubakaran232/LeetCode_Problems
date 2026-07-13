// Last updated: 7/13/2026, 11:07:41 PM
1class Solution {
2    public List<Integer> sequentialDigits(int low, int high) {
3        List<Integer> ans = new ArrayList<>();
4        String d = "123456789";
5        for (int l = 2; l <= 9; l++) {
6            for (int st = 0; st + l <= 9; st++) {
7                int num = Integer.parseInt(d.substring(st, st + l));
8                if (num >= low && num <= high) {
9                    ans.add(num);
10                }
11            }
12        }
13        return ans;
14    }
15}