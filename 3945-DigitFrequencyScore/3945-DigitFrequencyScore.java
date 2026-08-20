// Last updated: 8/20/2026, 2:39:12 PM
1class Solution {
2    public int digitFrequencyScore(int n) {
3        int sum = 0;
4        int freq[] = new int[10];
5        while(n>0){
6            freq[n%10]++;
7            n/=10;
8        }
9        for(int i=1;i<10;i++){
10            sum += i*freq[i];
11        }
12        return sum;
13    }
14}