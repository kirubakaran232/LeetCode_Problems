// Last updated: 8/24/2026, 2:53:46 PM
1class Solution {
2    public int[][] rotateGrid(int[][] grid, int k) {
3        int m = grid.length, n = grid[0].length;
4        int t = 0, b = m - 1, l = 0, r = n - 1;
5        int layers = Math.min(m, n) / 2;
6        while (layers-- > 0) {
7            ArrayList<Integer> arr = new ArrayList<>();
8            for (int i = l; i <= r; i++) {
9                arr.add(grid[t][i]);
10            }
11            for (int i = t + 1; i <= b; i++) {
12                arr.add(grid[i][r]);
13            }
14            for (int i = r - 1; i >= l; i--) {
15                arr.add(grid[b][i]);
16            }
17            for (int i = b - 1; i > t; i--) {
18                arr.add(grid[i][l]);
19            }
20            int len = arr.size();
21            int s = k % len;
22            for (int i = 0; i < s; i++) {
23                int temp = arr.remove(0);
24                arr.add(temp);
25            }
26            int index = 0;
27            for (int i = l; i <= r; i++) {
28                grid[t][i] = arr.get(index++);
29            }
30            for (int i = t + 1; i <= b; i++) {
31                grid[i][r] = arr.get(index++);
32            }
33            for (int i = r - 1; i >= l; i--) {
34                grid[b][i] = arr.get(index++);
35            }
36            for (int i = b - 1; i > t; i--) {
37                grid[i][l] = arr.get(index++);
38            }
39            t++;
40            b--;
41            l++;
42            r--;
43        }
44        return grid;
45    }
46}