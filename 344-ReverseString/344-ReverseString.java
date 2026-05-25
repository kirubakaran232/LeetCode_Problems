// Last updated: 5/25/2026, 7:19:44 PM
class Solution {
    public void reverseString(char[] s) {
        int l = 0,r = s.length-1;
        while(l<r){
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }
    }
}