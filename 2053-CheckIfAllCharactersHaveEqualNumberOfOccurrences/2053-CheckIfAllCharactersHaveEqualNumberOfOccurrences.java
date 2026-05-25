// Last updated: 5/25/2026, 7:12:58 PM
class Solution {
    public boolean areOccurrencesEqual(String s) {
        int freq[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        int count = 0;
        for (int f : freq) {
            if (f > 0) {
                count = f;
                break;
            }
        }
        for (int f : freq) {
            if (f > 0 && f != count)
                return false;
        }
        return true;
    }
}
