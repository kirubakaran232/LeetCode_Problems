// Last updated: 5/25/2026, 7:14:17 PM
class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> h = new HashMap<>();
        for (int n : nums) {
            h.put(n, h.getOrDefault(n, 0) + 1);
        }
        List<Map.Entry<Integer,Integer>> l = new ArrayList<>(h.entrySet());
        int ind = 0;
        Collections.sort(l, (a, b) -> {
            if (a.getValue().equals(b.getValue())) 
            return b.getKey() - a.getKey(); 
            return a.getValue() - b.getValue();
        });
        for(int i=0;i<l.size();i++){
            for(int j=0;j<l.get(i).getValue();j++){
                nums[ind] = l.get(i).getKey();
                ind++;
            }
        }
        return nums;
    }
}