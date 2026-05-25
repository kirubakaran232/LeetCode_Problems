// Last updated: 5/25/2026, 7:06:39 PM
class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int i = 0;
        int[] ans = new int[friends.length];
        for (int o: order){
            for (int friend: friends){
                if (o == friend){
                    ans[i] = friend;
                    i++;
                }
            }
        }
        return ans;
    }
}