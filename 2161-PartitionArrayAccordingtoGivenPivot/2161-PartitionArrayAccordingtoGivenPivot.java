// Last updated: 6/8/2026, 9:31:04 PM
1class Solution {
2    public int[] pivotArray(int[] arr, int pivot) {
3        int res[] = new int[arr.length];
4        int count = 0;
5        for(int i=0;i<arr.length;i++){
6            if(arr[i]<pivot){
7                res[count]=arr[i];
8                count++;
9            }
10        }
11        for(int i=0;i<arr.length;i++){
12            if(arr[i]==pivot){
13                res[count]=arr[i];
14                count++;
15            }
16        }
17        for(int i=0;i<arr.length;i++){
18            if(arr[i]>pivot){
19                res[count]=arr[i];
20                count++;
21            }
22        }
23        return res;
24    }
25}
26
27
28