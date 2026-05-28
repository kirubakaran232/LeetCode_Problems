// Last updated: 5/29/2026, 3:17:21 AM
1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3        Map<String, List<String>> hm = new HashMap<>();
4        for (int i = 0; i < strs.length; i++) {
5            char[] c = strs[i].toCharArray();
6            Arrays.sort(c);
7            String s = new String(c);
8            hm.putIfAbsent(s, new ArrayList<>());
9            hm.get(s).add(strs[i]);
10        }
11        return new ArrayList<>(hm.values());
12    }
13}