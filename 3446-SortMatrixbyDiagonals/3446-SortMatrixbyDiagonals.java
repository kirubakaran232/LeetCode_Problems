// Last updated: 8/22/2026, 6:17:50 PM
1class Solution {
2    public int[][] sortMatrix(int[][] grid) {
3        int n = grid.length;
4        Map<Integer, PriorityQueue<Integer>> hm = new HashMap<>();
5        for(int i=0;i<n;i++){
6            for(int j=0;j<n;j++){
7                int k = i - j;
8                if(!hm.containsKey(k)){
9                    if(k>=0){
10                        hm.put(k,new PriorityQueue<>(Collections.reverseOrder()));
11                    }else{
12                        hm.put(k,new PriorityQueue<>());
13                    }
14                }
15                hm.get(k).add(grid[i][j]);
16            }
17        }
18        for(int i=0;i<n;i++){
19            for(int j=0;j<n;j++){
20                grid[i][j] = hm.get(i-j).poll();
21            }
22        }
23        return grid;
24    }
25}