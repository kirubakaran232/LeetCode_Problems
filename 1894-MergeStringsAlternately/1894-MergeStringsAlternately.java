// Last updated: 5/25/2026, 7:13:42 PM
class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int w1 = word1.length();
        int w2 = word2.length();
        int len = Math.min(w1, w2);
        char[] ch1 = word1.toCharArray();
        char[] ch2 = word2.toCharArray();
        for (int i = 0; i < len; i++) {
            sb.append(ch1[i]);
            sb.append(ch2[i]);
        }
        if (w1 > len) {
            sb.append(word1.substring(len));
        }
        if (w2 > len) {
            sb.append(word2.substring(len));
        }
        return sb.toString();
    }
}
