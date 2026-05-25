// Last updated: 5/25/2026, 7:20:58 PM
class Solution {
    public boolean isHappy(int n) {
        Set<Integer> s = new HashSet<>();
        while(n!=1 && !s.contains(n)){
            s.add(n);
            int sum = 0;
           while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n = n / 10;
            }
            n=sum;
        }
        return n==1; 
    }
}