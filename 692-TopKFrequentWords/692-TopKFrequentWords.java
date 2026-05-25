// Last updated: 5/25/2026, 7:18:22 PM
class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        TreeMap<String,Integer> tm = new TreeMap<>();
        for(int i=0;i<words.length;i++){
            String s = words[i];
            tm.put(s,tm.getOrDefault(s,0)+1);
        }
        List<String> res = new ArrayList<>();
        List<Map.Entry<String,Integer>> l = new ArrayList<>(tm.entrySet());
        Collections.sort(l,(a,b) -> b.getValue() - a.getValue());
        for(int i=0;i<k;i++){
            res.add(l.get(i).getKey());
        }
        return res;
    }
}