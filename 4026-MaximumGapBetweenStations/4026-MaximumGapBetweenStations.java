// Last updated: 8/22/2026, 11:58:42 AM
1class Solution {
2    public int maximumGap(String sk, String st) {
3        int f[] = new int[sk.length()];
4        int l[] = new int[sk.length()];
5        int idx=0;
6        for(int i=0;i<sk.length();i++){
7            // for(int j=idx;j<st.length();j++){
8            //     if(sk.charAt(i)==st.charAt(j)){
9            //         f[i] = j;
10            //         System.out.print(f[i]);
11            //         idx++;
12            //         break;
13            //     }
14            //     idx++;
15            //}
16            while(idx<st.length()){
17                if(sk.charAt(i)==st.charAt(idx)){
18                    f[i] = idx;
19                    idx++;
20                    break;
21                }
22                idx++;
23            }
24        }
25        int ind = st.length()-1;
26        for(int i=sk.length()-1;i>=0;i--){
27            // for(int j=ind;j>=0;j--){
28            //     if(sk.charAt(i)==st.charAt(j)){
29            //         l[i] = j;
30            //         ind--;
31            //         System.out.print(l[i]);
32            //         break;
33            //     }
34            //     ind--;
35            // }
36            while(ind>=0){
37                if(sk.charAt(i)==st.charAt(ind)){
38                    l[i] = ind;
39                    ind--;
40                    break;
41                }
42                ind--;
43            }
44        }
45        int max = 0;
46        for(int i=0;i<sk.length()-1;i++){
47            int gap = l[i+1] - f[i];
48            max = Math.max(max,gap);
49        }
50        return max;
51    }
52}