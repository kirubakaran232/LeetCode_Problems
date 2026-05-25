// Last updated: 5/25/2026, 7:06:33 PM
class Solution {
    public int maxDistinct(String s) {
        Set<Character> c = new HashSet<>();
        for(int i=0;i<s.length();i++){
            c.add(s.charAt(i));
        }
        return c.size();
    }
}