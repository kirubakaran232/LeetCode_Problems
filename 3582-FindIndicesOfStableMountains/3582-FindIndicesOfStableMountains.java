// Last updated: 5/25/2026, 7:07:51 PM
class Solution {
    public List<Integer> stableMountains(int[] height, int threshold) {
        List<Integer> l = new ArrayList<>();
        for(int i=1;i<height.length;i++){
            if(height[i-1]>threshold){
                l.add(i);
            }
        }
        return l;
    }
}