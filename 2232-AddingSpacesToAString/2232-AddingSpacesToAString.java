// Last updated: 5/25/2026, 7:12:13 PM
class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (int j = 0; j < s.length(); j++) {
            if (i < spaces.length && j == spaces[i]) {
                sb.append(" ");
                i++;
            }
            sb.append(s.charAt(j));
        }

        return sb.toString();
    }
}
