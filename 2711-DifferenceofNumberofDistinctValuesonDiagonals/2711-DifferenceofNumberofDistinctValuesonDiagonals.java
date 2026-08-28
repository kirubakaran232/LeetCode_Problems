// Last updated: 8/28/2026, 9:45:46 AM
1class Solution {
2    public int[][] differenceOfDistinctValues(int[][] grid) {
3        int ans[][] = new int[grid.length][grid[0].length];
4        for(int i=0;i<grid.length;i++){
5            for(int j=0;j<grid[0].length;j++){
6                ans[i][j] = helper(grid,i,j);
7            }
8        }
9        return ans;
10    }
11    public int helper(int grid[][],int r,int c){
12        Set<Integer> la = new HashSet<>();
13        Set<Integer> rb = new HashSet<>();
14        int i = r, j = c;
15        while(i-1>=0 && j-1>=0){
16            la.add(grid[--i][--j]);
17        }
18        i = r;
19        j = c;
20        while(i+1<grid.length && j+1<grid[0].length){
21            rb.add(grid[++i][++j]);
22        }
23        System.out.println(la.size()+" "+rb.size());
24        return Math.abs(la.size()-rb.size());
25    }
26}