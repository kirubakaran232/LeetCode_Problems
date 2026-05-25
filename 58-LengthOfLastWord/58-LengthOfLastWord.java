// Last updated: 5/25/2026, 7:22:55 PM
class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.split("\\s+");
        return words[words.length - 1].length();
    }
}