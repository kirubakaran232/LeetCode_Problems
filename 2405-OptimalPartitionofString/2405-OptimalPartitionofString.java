// Last updated: 7/17/2026, 6:06:30 PM
1class Solution {
2    public int partitionString(String s) {
3        Set<Character> hs = new HashSet<>();
4        int c = 0;
5        for(int i=0;i<s.length();i++){
6            if(hs.contains(s.charAt(i))){
7                hs.clear();
8                c++;
9            }
10            hs.add(s.charAt(i));
11        }
12        if(hs.size()>=1) c++;
13        return c;
14    }
15}