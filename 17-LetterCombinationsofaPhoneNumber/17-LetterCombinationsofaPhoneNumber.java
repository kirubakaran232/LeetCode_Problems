// Last updated: 5/30/2026, 3:44:25 AM
1class Solution {
2    Map<Character,String> hm;
3    List<String> res;
4    public List<String> letterCombinations(String digits) {
5        int n = digits.length();
6        hm = new HashMap<>();
7        res = new ArrayList<>();
8        hm.put('2',"abc");
9        hm.put('3',"def");
10        hm.put('4',"ghi");
11        hm.put('5',"jkl");
12        hm.put('6',"mno");
13        hm.put('7',"pqrs");
14        hm.put('8',"tuv");
15        hm.put('9',"wxyz");
16        backtrack(digits,new StringBuilder(),0);
17        return res;
18    }
19    public void backtrack(String dig,StringBuilder path,int ind){
20        if (ind == dig.length()) {
21            res.add(path.toString());
22            return;
23        }
24        String x = hm.get(dig.charAt(ind));
25        for (char i : x.toCharArray()) {
26            path.append(i);
27            backtrack(dig,path,ind+1);
28            path.deleteCharAt(path.length() - 1);
29        }
30    }
31}