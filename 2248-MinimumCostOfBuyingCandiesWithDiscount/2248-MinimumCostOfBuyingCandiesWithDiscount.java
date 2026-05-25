// Last updated: 5/25/2026, 7:12:06 PM
class Solution {
        public int minimumCost(int[] A) {
        Arrays.sort(A);
        int res = 0, n = A.length;
        for (int i = 0; i < n; ++i)
            if (i % 3 != n % 3)
                res += A[i];
        return res;
    }
}