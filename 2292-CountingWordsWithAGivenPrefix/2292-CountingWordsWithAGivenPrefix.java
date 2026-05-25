// Last updated: 5/25/2026, 7:11:51 PM
class Solution {
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        int n = pref.length();
        for (String w : words) {
            if (w.length() >= n && w.startsWith(pref)) {
                count++;
            }
        }
        return count;
    }
}