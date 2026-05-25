// Last updated: 5/25/2026, 7:06:31 PM
class Solution {
    public int minLengthAfterRemovals(String s) {
        int acnt=0,bcnt=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a') acnt++;
            else bcnt++;
        }
        return Math.abs(acnt-bcnt);
    }
}