// Last updated: 5/25/2026, 7:06:45 PM
class Solution {
    public int getLeastFrequentDigit(int n) {
        int freq[] = new int[10];
        while(n>0){
            int l = n%10;
            freq[l]++;
            n=n/10;
        }
        int ans = 0, count = 1000;
        for (int d = 0; d < 10; d++) {
            if (freq[d] > 0 && freq[d] < count) {
                count = freq[d];
                ans = d;
            }
        }
        return ans;
    }
}