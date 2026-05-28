// Last updated: 5/28/2026, 4:03:16 PM
1class Solution {
2    public int characterReplacement(String s, int k) {
3        int l = 0,mf = 0,ml = 0;
4        Map<Character,Integer> hm = new HashMap<>();
5        for(int r=0;r<s.length();r++){
6            char ch = s.charAt(r);
7            hm.put(ch,hm.getOrDefault(ch,0)+1);
8            mf = Math.max(mf,hm.get(ch));
9            while((r-l+1)-mf>k){
10                hm.put(s.charAt(l),hm.get(s.charAt(l))-1);
11                l++;
12            }
13            ml = Math.max(ml,(r-l+1));
14        }
15        return ml;
16    }
17}