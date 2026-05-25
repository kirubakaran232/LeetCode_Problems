// Last updated: 5/25/2026, 7:12:41 PM
class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder();
        int idx = word.indexOf(ch);
        if (idx==-1){
            return word;
        }
        for (int i=idx; i>=0; i--){
            sb.append(word.charAt(i));
        }
        for (int i=idx+1; i<word.length(); i++) {
            sb.append(word.charAt(i));
        }
        return sb.toString();
    }
}
