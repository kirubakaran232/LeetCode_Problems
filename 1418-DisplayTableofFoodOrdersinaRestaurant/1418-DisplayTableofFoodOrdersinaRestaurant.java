// Last updated: 8/21/2026, 1:42:14 PM
1class Solution {
2    public List<List<String>> displayTable(List<List<String>> orders) {
3        List<List<String>> res = new ArrayList<>();
4        res.add(new ArrayList<>());
5        res.get(0).add("Table");
6        TreeSet<String> ts = new TreeSet<>();
7        TreeMap<Integer,List<String>> tm = new TreeMap<>();
8        for(List<String> l:orders){
9            int k = Integer.parseInt(l.get(1));
10            String str = l.get(2);
11            ts.add(str);
12            if(tm.containsKey(k))
13            {
14                tm.get(k).add(str);
15            }else{
16                tm.put(k,new ArrayList<>());
17                tm.get(k).add(str);
18            }
19        }
20        for(String st:ts){
21            res.get(0).add(st);
22        }
23
24        for(Map.Entry<Integer,List<String>> en : tm.entrySet()){
25            Map<String,Integer> hm = new HashMap<>();
26            int temp = en.getKey();
27            for(String x:en.getValue()){
28                hm.put(x,hm.getOrDefault(x,0)+1);
29                System.out.print(x+" ");
30                System.out.println(hm.get(x)+" ");
31            }
32            ArrayList<String> al = new ArrayList<>();
33            al.add(String.valueOf(temp));
34            for(String x:ts){
35                if(hm.containsKey(x)){
36                    al.add(String.valueOf(hm.get(x)));
37                }else{
38                    al.add("0");
39                }
40            }
41            res.add(new ArrayList<>(al));
42        }
43        return res;
44    }
45}