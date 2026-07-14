// Last updated: 7/14/2026, 11:25:29 PM
1class Solution {
2    public List<String> stringSequence(String t) {
3        List<String> l = new ArrayList<>();
4        StringBuilder sb = new StringBuilder();
5        for(int i=0;i<t.length();i++){
6            char ch = t.charAt(i);
7            sb.append("a");
8            l.add(sb.toString());
9            while(ch!=sb.charAt(sb.length()-1)){
10                char last = sb.charAt(sb.length()-1);
11                sb.setCharAt(sb.length()-1,(char)(last+1));
12                l.add(sb.toString());
13            }
14        }
15        return l;
16    }
17}