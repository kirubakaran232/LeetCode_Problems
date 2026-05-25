// Last updated: 5/25/2026, 7:11:24 PM
class Solution {
    public char repeatedCharacter(String s) {
        Set<Character> c = new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(c.contains(s.charAt(i))) return s.charAt(i); 
            c.add(s.charAt(i));
        }
        return 'a';
    }
}