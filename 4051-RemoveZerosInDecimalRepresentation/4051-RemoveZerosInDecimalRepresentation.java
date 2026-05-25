// Last updated: 5/25/2026, 7:06:37 PM
class Solution {
    public long removeZeros(long n) {
        String s = String.valueOf(n);     
        s = s.replace("0", "");           
        return Long.parseLong(s);       
    }
}
