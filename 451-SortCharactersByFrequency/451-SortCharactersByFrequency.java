// Last updated: 5/25/2026, 7:19:14 PM
class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        List<Map.Entry<Character,Integer>> l = new ArrayList<>(hm.entrySet());
        Collections.sort(l,(a,b) -> b.getValue()-a.getValue());
        for(int i=0;i<l.size();i++){
            for(int j=0;j<l.get(i).getValue();j++){
                sb.append(l.get(i).getKey());
            }
        }
        return sb.toString();
    }
}