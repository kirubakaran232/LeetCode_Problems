// Last updated: 6/10/2026, 11:05:54 PM
1class Solution {
2    public int candy(int[] ratings) {
3    int n = ratings.length;
4    int[] candies = new int[n];
5    Arrays.fill(candies, 1);
6    for (int i = 1; i < n; i++) {
7        if (ratings[i] > ratings[i - 1]) {
8            candies[i] = candies[i - 1] + 1;
9        }
10    }
11    for (int i = n - 2; i >= 0; i--) {
12        if (ratings[i] > ratings[i + 1]) {
13            candies[i] = Math.max(candies[i], candies[i + 1] + 1);
14        }
15    }
16    int tot = 0;
17    for (int i=0;i<candies.length;i++) tot += candies[i];
18    return tot;
19    }
20}