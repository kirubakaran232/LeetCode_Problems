// Last updated: 5/25/2026, 7:19:26 PM
class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character,Integer> hm = new HashMap<>();
        int l = 0;
        int maxfreq = 0;
        int maxlen = 0;
        for(int r = 0; r < s.length(); r++){
            char ch = s.charAt(r);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
            maxfreq = Math.max(maxfreq, hm.get(ch));
            while((r - l + 1) - maxfreq > k){
                hm.put(s.charAt(l), hm.get(s.charAt(l)) - 1);
                l++;
            }
            maxlen = Math.max(maxlen, r - l + 1);
        }
        return maxlen;
    }
}
