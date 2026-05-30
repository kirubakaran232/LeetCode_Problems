// Last updated: 5/30/2026, 12:32:55 PM
1class Solution {
2    public int[][] insert(int[][] inter, int[] newInter) {
3        List<int[]> l = new ArrayList<>();
4        int i = 0;
5        int n = inter.length;
6        while(i<n && inter[i][1]<newInter[0]){
7            l.add(inter[i]);
8            i++;
9        }
10        while(i<n && inter[i][0]<=newInter[1]){
11            newInter[0] = Math.min(inter[i][0],newInter[0]);
12            newInter[1] = Math.max(inter[i][1],newInter[1]);
13            i++;
14        }
15        l.add(newInter);
16        while(i<n){
17            l.add(inter[i]);
18            i++;
19        }
20        return l.toArray(new int[l.size()][]);
21    }
22}