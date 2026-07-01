// Last updated: 7/1/2026, 5:56:29 PM
1class Solution {
2    public int passwordStrength(String str) {
3        Set<Character> l = new HashSet<>();
4        Set<Character> u = new HashSet<>();
5        Set<Integer> n = new HashSet<>();
6        Set<Character> s = new HashSet<>();
7        for(int i=0;i<str.length();i++){
8            char ch = str.charAt(i);
9            if(Character.isDigit(ch)){
10                n.add(ch-'0');
11            }else if(ch>='a' && ch<='z'){
12                l.add(ch);
13            }else if(ch>='A' && ch<='Z'){
14                u.add(ch);
15            }else{
16                s.add(ch);
17            }
18        }
19        return (l.size()*1) + (u.size()*2) + (n.size()*3) + (s.size()*5);
20    }
21}