// Last updated: 5/25/2026, 7:09:50 PM
class Solution {
    public String removeTrailingZeros(String num) {
        int last = 0;
        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) != '0') {
                last = i;
            }
        }
        return num.substring(0, last + 1);
    }
}