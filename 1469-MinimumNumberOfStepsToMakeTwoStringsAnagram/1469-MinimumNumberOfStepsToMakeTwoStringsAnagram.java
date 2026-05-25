// Last updated: 5/25/2026, 7:15:31 PM
class Solution {
    public int minSteps(String s, String t) {
        int count=0;
        int dp[] = new int[26];
        for(int i=0;i<s.length();i++){
            dp[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            dp[t.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(dp[i]>0){
                count+=dp[i];
            }
        }
        return count;
    }
}