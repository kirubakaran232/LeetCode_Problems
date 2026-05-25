// Last updated: 5/25/2026, 7:19:25 PM
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int l = 0,r = p.length();
        while (r <= s.length()) {
            if(isAnagram(s.substring(l,r),p)) list.add(l);
            l++;
            r++;
        }
        return list;
    }
    public boolean isAnagram(String s,String p){
        int dp[] = new int[26];
        for(int i=0;i<s.length();i++){
            dp[s.charAt(i)-'a']++; 
        }
        for(int i=0;i<p.length();i++){
            dp[p.charAt(i)-'a']--; 
        }
        for(int i=0;i<26;i++){
            if(dp[i]!=0) return false;
        }
        return true;
    }
}