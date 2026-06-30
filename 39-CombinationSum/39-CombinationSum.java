// Last updated: 6/30/2026, 9:50:45 AM
1class Solution {
2    public List<List<Integer>> combinationSum(int[] arr, int t) {
3        ArrayList<List<Integer>> res = new ArrayList<>();
4        Arrays.sort(arr);
5        bt(arr,new ArrayList<>(),res,0,t);
6        return res;
7    }
8    static void bt(int arr[],ArrayList<Integer> l,ArrayList<List<Integer>> res,int st,int rem){
9        if(rem<0) return;
10        else if(rem==0){
11            res.add(new ArrayList<Integer>(l));
12            return;
13        }else{
14            for(int i=st;i<arr.length;i++){
15                if(rem>0) l.add(arr[i]);
16                bt(arr,l,res,i,rem-arr[i]);
17                l.remove(l.size()-1);
18            }
19        }
20    }
21}