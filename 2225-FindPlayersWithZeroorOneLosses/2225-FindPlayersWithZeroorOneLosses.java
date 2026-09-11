// Last updated: 9/11/2026, 11:29:47 AM
1class Solution {
2    public List<List<Integer>> findWinners(int[][] m) {
3        List<List<Integer>> res = new ArrayList<>();
4        TreeMap<Integer,Integer> hm = new TreeMap<>();
5        for(int i=0;i<m.length;i++){
6            hm.put(m[i][1],hm.getOrDefault(m[i][1],0)+1);
7            hm.put(m[i][0],hm.getOrDefault(m[i][0],0));
8        }
9        List<Integer> f = new ArrayList<>();
10        List<Integer> s = new ArrayList<>();
11        for(int key:hm.keySet()){
12            if(hm.get(key)==1) s.add(key);
13            if(hm.get(key)==0) f.add(key);
14        }
15        res.add(f);
16        res.add(s);
17        return res;
18    }
19}
20