// Last updated: 5/25/2026, 7:23:37 PM
class Solution {
    Map<Character,String> hm;
    List<String> res;
    public List<String> letterCombinations(String digits) {
        int n = digits.length();
        hm = new HashMap<>();
        res = new ArrayList<>();
        hm.put('2',"abc");
        hm.put('3',"def");
        hm.put('4',"ghi");
        hm.put('5',"jkl");
        hm.put('6',"mno");
        hm.put('7',"pqrs");
        hm.put('8',"tuv");
        hm.put('9',"wxyz");
        backtrack(digits,new StringBuilder(),0);
        return res;
    }
    public void backtrack(String dig,StringBuilder path,int ind){
        if (ind == dig.length()) {
            res.add(path.toString());
            return;
        }
        String x = hm.get(dig.charAt(ind));
        for (char i : x.toCharArray()) {
            path.append(i);
            backtrack(dig,path,ind+1);
            path.deleteCharAt(path.length() - 1);
        }
    }
}