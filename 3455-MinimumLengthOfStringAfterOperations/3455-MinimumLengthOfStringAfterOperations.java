// Last updated: 5/25/2026, 7:08:15 PM
class Solution {
    public int minimumLength(String s) {
        int freq[] = new int[26];
        int ans = 0;
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if (freq[i] > 0) {
                if (freq[i] % 2 == 0) ans += 2;
                else ans += 1;
            }
        }
        return ans;
    }
}