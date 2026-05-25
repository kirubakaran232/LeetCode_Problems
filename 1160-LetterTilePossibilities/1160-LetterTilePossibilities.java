// Last updated: 5/25/2026, 7:16:42 PM
class Solution {
    public int numTilePossibilities(String tiles) {
        int[] freq = new int[26];
        for (char c : tiles.toCharArray()){
            freq[c - 'A']++;
        }
        return backtrack(freq);
    }
    public int backtrack(int[] freq) {
        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                freq[i]--;
                count += 1 + backtrack(freq);
                freq[i]++;
            }
        }
        return count;
    }
}