// Last updated: 5/25/2026, 7:20:16 PM
class Solution {
    public boolean isAnagram(String s, String t) {
        int dp[] = new int[26];
        for(int i=0;i<s.length();i++){
            dp[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            dp[t.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(dp[i]!=0){
                return false;
            }
        }
        return true;

    }
}