// Last updated: 7/17/2026, 11:38:36 AM
1class Solution {
2    public int numberOfSubstrings(String s, int k) {
3        int c = 0,l = 0,len = s.length();
4        HashMap<Character,Integer> hm = new HashMap<>();
5        for(int r=0;r<s.length();r++){
6            char ch = s.charAt(r);
7            hm.put(ch,hm.getOrDefault(ch,0)+1);
8            while(hm.get(ch).intValue()==k){
9                c+=len-r;
10                hm.put(s.charAt(l),hm.get(s.charAt(l))-1);
11                l++;
12            }
13        }
14        return c;
15    }
16}