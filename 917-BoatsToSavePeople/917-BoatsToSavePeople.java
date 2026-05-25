// Last updated: 5/25/2026, 7:17:41 PM
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int boat = 0;
        int l = 0,r = people.length-1;
        while(l<=r){
            if(people[l]+people[r]<=limit){
                boat++;
                l++;
                r--;
            }else{
                boat++;
                r--;
            }
        }
        return boat;
    }
}