// Last updated: 5/25/2026, 7:23:47 PM
class Solution {
    public boolean isPalindrome(int x) {
        int og = x;
        int rev = 0;
        while (x > 0) {
            int temp = x % 10;
            rev = rev * 10 + temp;
            x /= 10;
        }
        return rev == og;
    }
}