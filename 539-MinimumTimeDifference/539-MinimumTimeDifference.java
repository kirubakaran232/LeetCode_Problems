// Last updated: 8/28/2026, 1:45:18 PM
1class Solution {
2    public int findMinDifference(List<String> t) {
3        int arr[] = new int[t.size()];
4        for(int i=0;i<t.size();i++){
5            String s = t.get(i);
6            int h = Integer.parseInt(s.substring(0,2));
7            int m = Integer.parseInt(s.substring(3,5));
8            if(h+m==0) h = 24;
9            arr[i] = (h*60)+ m;
10        }
11        Arrays.sort(arr);
12        int min = Integer.MAX_VALUE;
13        for(int i=1;i<t.size();i++){
14            min = Math.min(Math.abs(arr[i-1]-arr[i]),min);
15        }
16        min = Math.min(min,Math.abs(((24*60)-arr[arr.length-1])+arr[0]));
17        return min;
18    }
19}