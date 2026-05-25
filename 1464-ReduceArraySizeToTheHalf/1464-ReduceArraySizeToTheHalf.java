// Last updated: 5/25/2026, 7:15:35 PM
class Solution {
    public int minSetSize(int[] arr) {
        int count = 0;
        Map<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        int size = arr.length;
        List<Map.Entry<Integer,Integer>> l = new ArrayList<>(hm.entrySet());
        Collections.sort(l,(a,b) -> b.getValue() - a.getValue());
        for(int i=0;i<l.size();i++){
            size-=l.get(i).getValue();
            count++;
            if(size<=arr.length/2){
                return count;
            }
        }
        return 0;
    }
}