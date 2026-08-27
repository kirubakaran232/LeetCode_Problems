// Last updated: 8/27/2026, 2:05:21 PM
1class Solution {
2    public int[][] diagonalSort(int[][] mat) {
3        Map<Integer,PriorityQueue<Integer>> hm =  new HashMap<>();
4        for(int i=0;i<mat.length;i++){
5            for(int j=0;j<mat[0].length;j++){
6                int k = i-j;
7                if(!hm.containsKey(k)){
8                    hm.put(k,new PriorityQueue<>());
9                }
10                hm.get(k).add(mat[i][j]);
11            }
12        }
13        for(int i=0;i<mat.length;i++){
14            for(int j=0;j<mat[0].length;j++){
15                int val = hm.get(i-j).poll();
16                mat[i][j] = val;
17            }
18        }
19        return mat;
20    }
21}