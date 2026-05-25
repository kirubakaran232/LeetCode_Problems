// Last updated: 5/25/2026, 7:13:19 PM
class Solution {
    public boolean checkIfPangram(String s) {
        int freq[] = new int[26];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            freq[ch-'a']++;
        }
        for(int i=0;i<26;i++){
            if(freq[i]==0){
                return false;
            }
        }
        return true;
    }
}