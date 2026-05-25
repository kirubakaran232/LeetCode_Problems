// Last updated: 5/25/2026, 7:17:37 PM
class Solution {
    public int totalFruit(int[] fruits) {
        int l = 0,r = 0,n = fruits.length;
        Map<Integer,Integer> hm = new HashMap<>();
        int maxlen = 0;
        while(r<n){
            hm.put(fruits[r],hm.getOrDefault(fruits[r],0)+1);
            r++;
            while(hm.size()>2){
                hm.put(fruits[l],hm.get(fruits[l])-1);
                if(hm.get(fruits[l])==0) hm.remove(fruits[l]);
                l++;
            }
            maxlen = Math.max(maxlen,r-l);
        }
        return maxlen;
    }
}