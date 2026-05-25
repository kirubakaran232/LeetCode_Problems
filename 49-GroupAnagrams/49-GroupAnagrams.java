// Last updated: 5/25/2026, 7:23:05 PM
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hm = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] c = strs[i].toCharArray();
            Arrays.sort(c);
            String s = new String(c);
            hm.putIfAbsent(s, new ArrayList<>());
            hm.get(s).add(strs[i]);
        }
        return new ArrayList<>(hm.values());
    }
}