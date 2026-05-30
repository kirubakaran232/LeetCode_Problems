// Last updated: 5/30/2026, 7:06:54 AM
1class Solution {
2    HashMap<Character,String> hm;
3    List<String> res;
4    public List<String> letterCombinations(String d) {
5        hm = new HashMap<>();
6        res = new ArrayList<>();
7        hm.put('2',"abc");
8        hm.put('3',"def");
9        hm.put('4',"ghi");
10        hm.put('5',"jkl");
11        hm.put('6',"mno");
12        hm.put('7',"pqrs");
13        hm.put('8',"tuv");
14        hm.put('9',"wxyz");
15        bt(d,new StringBuilder(),0);
16        return res;
17    }
18    public void bt(String d, StringBuilder sb, int ind){
19        if(ind == d.length()){
20            res.add(sb.toString());
21            return;
22        }
23        String s = hm.get(d.charAt(ind));
24        for(int i=0; i<s.length(); i++){
25            sb.append(s.charAt(i));
26            bt(d, sb, ind+1);
27            sb.deleteCharAt(sb.length()-1);
28        }
29    }
30}