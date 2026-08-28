// Last updated: 8/28/2026, 10:05:29 AM
1class Solution {
2    public List<String> printVertically(String s) {
3        List<String> res = new ArrayList<>();
4        String[] w = s.split("\\s+");
5        int max = 0;
6        for(int i=0;i<w.length;i++){
7            max = Math.max(w[i].length(),max);
8        }
9        for (int i=0;i<max;i++) {
10            StringBuilder sb = new StringBuilder();
11            for (int j=0;j<w.length;j++){
12                if (i < w[j].length()) {
13                    sb.append(w[j].charAt(i));
14                } else {
15                    sb.append(' ');
16                }
17            }
18            int l = sb.length() - 1;
19            while (l>=0 && sb.charAt(l)==' ') {
20                l--;
21            }
22            res.add(sb.substring(0, l+1));
23        }
24        return res;
25    }
26}