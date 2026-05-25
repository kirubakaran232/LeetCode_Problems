// Last updated: 5/25/2026, 7:15:37 PM
class Solution {
    public int numberOfSubstrings(String s) {
        int count = 0 ,l = 0;
        Map<Character,Integer> hm = new HashMap<>();
        for(int r=0;r<s.length();r++){
            char ch = s.charAt(r);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
            while(hm.getOrDefault('a',0)>0 && hm.getOrDefault('b',0)>0 && hm.getOrDefault('c',0)>0){
                count += s.length() - r;
                char c = s.charAt(l);
                hm.put(c,hm.get(c)-1);
                l++;
            }
        }
        return count;
    }
}