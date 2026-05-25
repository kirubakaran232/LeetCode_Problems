// Last updated: 5/25/2026, 7:23:56 PM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> hs = new HashSet<>();
        int l = 0,r = s.length()-1;
        int len = 0,st = 0;
        while(l<=r){
            while(hs.contains(s.charAt(l))){
                hs.remove(s.charAt(st));
                st++;
            }
            hs.add(s.charAt(l));
            len = Math.max(l-st+1,len);
            l++;
        }
        return len;
    }
}