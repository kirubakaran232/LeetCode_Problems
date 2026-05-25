// Last updated: 5/25/2026, 7:11:49 PM
class Solution {
    public int minSteps(String s, String t) {
        int count=0;
        int dps[] = new int[26];
        int dpt[] = new int[26];
        for(int i=0;i<s.length();i++){
            dps[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            dpt[t.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            count+=Math.abs(dps[i]-dpt[i]);
        }
        return count;
    }
}