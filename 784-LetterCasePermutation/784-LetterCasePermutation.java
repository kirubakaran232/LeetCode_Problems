// Last updated: 8/22/2026, 1:47:33 PM
1class Solution {
2    List<String> l;
3    public List<String> letterCasePermutation(String s) {
4        l = new ArrayList<>();
5        bt(s, new StringBuilder(), 0);
6        return l;
7    }
8    void bt(String s, StringBuilder sb, int ind) {
9        if(sb.length()==s.length()){
10            l.add(sb.toString());
11            return;
12        }
13        char c = s.charAt(ind);
14        if(Character.isDigit(c)){
15            sb.append(c);
16            bt(s,sb,ind+1);
17            sb.deleteCharAt(sb.length()-1);
18        }else{
19            sb.append(Character.toLowerCase(c));
20            bt(s,sb,ind+1);
21            sb.deleteCharAt(sb.length()-1);
22            sb.append(Character.toUpperCase(c));
23            bt(s,sb,ind+1);
24            sb.deleteCharAt(sb.length()-1);
25
26        }
27    }
28}