// Last updated: 5/25/2026, 7:13:07 PM
class Solution {
    public String removeOccurrences(String s, String part) {
        while (s.contains(part))
            s = s.replaceFirst(part, "");
        return s;
    }
}