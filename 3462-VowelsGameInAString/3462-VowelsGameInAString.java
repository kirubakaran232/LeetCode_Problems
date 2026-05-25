// Last updated: 5/25/2026, 7:08:13 PM
class Solution {
    public boolean doesAliceWin(String s) {
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                return true;
            }
        }
        return false;
    }
}