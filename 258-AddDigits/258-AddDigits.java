// Last updated: 5/25/2026, 7:20:12 PM
class Solution {
    public int addDigits(int num) {
         while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10; 
                num /= 10;     
            }
            num = sum; 
        }
        return num;
    }
}