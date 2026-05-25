// Last updated: 5/25/2026, 7:07:37 PM
class Solution {
    public String findCommonResponse(List<List<String>> responses) {
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        int n = responses.size();
        for(int i = 0;i<n;i++){
            int m = responses.get(i).size();
            HashSet<String> set = new HashSet<String>();
            for(int j = 0;j<m;j++)
                set.add(responses.get(i).get(j));
            for(String s:set)
                map.put(s,map.getOrDefault(s,0)+1);
        }
        int max = 0;
        String ans = "";
        for(Map.Entry<String,Integer> m:map.entrySet()){
            if(max < m.getValue()){
                ans = m.getKey();
                max = m.getValue();
            }
            else if( max == m.getValue()){
                if(ans.compareTo(m.getKey())>0){
                    ans = m.getKey();
                    max = m.getValue();
                }
            }
        }
        return  ans;
    }
}