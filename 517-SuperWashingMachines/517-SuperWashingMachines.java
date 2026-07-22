// Last updated: 7/22/2026, 9:06:49 PM
1class Solution {
2    public int findMinMoves(int[] mac) {
3        int sum = 0;
4        for(int i=0;i<mac.length;i++){
5            sum+=mac[i];
6        }
7        if(sum % mac.length != 0)return -1;
8        int avg = sum/mac.length;
9        int c = 0;
10        int max = 0;
11        for(int num: mac){
12            c += num - avg;
13            max = Math.max(Math.max(max,Math.abs(c)),num-avg);
14        }
15        return max;
16    }
17}