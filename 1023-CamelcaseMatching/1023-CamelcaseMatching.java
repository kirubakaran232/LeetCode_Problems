// Last updated: 8/31/2026, 11:50:06 AM
1class Solution {
2    public List<Boolean> camelMatch(String[] q, String p) {
3        List<Boolean> l = new ArrayList<>();
4        for (String s : q) {
5            boolean b = help(s,p);
6            l.add(b);
7        }
8        return l;
9    }
10
11    public boolean help(String s, String p) {
12        int i = 0, j = 0;
13        boolean b = true;
14        while (i < s.length()) {
15            if (j < p.length() && s.charAt(i) == p.charAt(j)) {
16                j++;
17            } else if (Character.isUpperCase(s.charAt(i))) {
18                b = false;
19                break;
20            }
21            i++;
22        }
23        return i==s.length() && j == p.length();
24    }
25}