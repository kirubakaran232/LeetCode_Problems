// Last updated: 5/25/2026, 7:19:59 PM
class NumArray {
    int prefix[];
    public NumArray(int[] nums) {
        prefix = new int[nums.length];
        prefix[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        int ans = 0;
        if(left==0) return prefix[right];
        else {
           ans = prefix[right]-prefix[left-1];
        }
        return ans;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */