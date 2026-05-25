// Last updated: 5/25/2026, 7:19:35 PM
class Solution {
    public boolean canConstruct(String r, String m) {
        if(r.length()>m.length()) return false;
        int freq[] = new int[26];
        for(int i=0;i<r.length();i++){
            freq[r.charAt(i)-'a']++;
        }
        for(int i=0;i<m.length();i++){
            freq[m.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(freq[i]>0) return false;
        }
        return true;
    }
}