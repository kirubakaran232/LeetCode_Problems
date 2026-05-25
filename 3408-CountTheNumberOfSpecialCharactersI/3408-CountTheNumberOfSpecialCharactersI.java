// Last updated: 5/25/2026, 7:08:29 PM
class Solution {
    public int numberOfSpecialChars(String word) {
        char arr[] = word.toCharArray();
        boolean lower[] = new boolean[26]; 
        boolean upper[] = new boolean[26]; 
        int count = 0;
        for (char c : arr) {
            if (Character.isLowerCase(c))
                lower[c - 'a'] = true;
            else if (Character.isUpperCase(c))
                upper[c - 'A'] = true;
        }
        for (int i = 0; i < 26; i++) {
            if (lower[i] && upper[i])
                count++;
        }
        return count;
    }
}
