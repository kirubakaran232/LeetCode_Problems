// Last updated: 6/30/2026, 10:20:23 AM
1class Solution {
2    public int numberOfSubstrings(String s) {
3        Map<Character,Integer> hm = new HashMap<>();
4        int l = 0,c = 0;
5        for(int r=0;r<s.length();r++){
6            char ch = s.charAt(r);
7            hm.put(ch,hm.getOrDefault(ch,0)+1);
8            while(hm.getOrDefault('a',0)>0 && hm.getOrDefault('b',0)>0 && hm.getOrDefault('c',0)>0){
9                c+=s.length()-r;
10                hm.put(s.charAt(l),hm.get(s.charAt(l))-1);
11                l++;
12            }
13        }
14        return c;
15    }
16}