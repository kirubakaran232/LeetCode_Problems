// Last updated: 5/25/2026, 7:08:57 PM
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        List<Integer> l = new ArrayList<>();
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid.length; j++){
                l.add(grid[i][j]);
            }
        }
        Collections.sort(l);
        int sum = 0;
        int ans[] = new int[2];
        for(int i = 0; i < l.size() - 1; i++){
            sum += l.get(i);
            if(l.get(i).equals(l.get(i + 1))){
                ans[0] = l.get(i); 
            }
        }
        sum += l.get(l.size() - 1);
        int n = l.size();
        int expectedSum = (n * (n + 1)) / 2;
        ans[1] = expectedSum - (sum - ans[0]); // missing
        return ans;
    }
}
