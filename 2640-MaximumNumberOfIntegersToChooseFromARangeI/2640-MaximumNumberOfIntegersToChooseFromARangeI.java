// Last updated: 5/25/2026, 7:10:25 PM
class Solution {
    public int maxCount(int[] ban, int n, int maxSum) {
        Set<Integer> s = new HashSet<>();
        for(int i=0;i<ban.length;i++){
            s.add(ban[i]);
        }
        int sum = 0,count = 0;
        for(int i=1;i<=n;i++){
            if(!s.contains(i) && sum+i <= maxSum){
                sum+=i;
                count++;
            }
        }
        return count;
    }
}