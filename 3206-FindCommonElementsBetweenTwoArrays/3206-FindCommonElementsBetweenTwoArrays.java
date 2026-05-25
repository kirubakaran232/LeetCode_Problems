// Last updated: 5/25/2026, 7:09:06 PM
class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int ans[] = new int[2];
        int acount=0,bcount=0;
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int n1:nums1){
            set1.add(n1);
        }
        for(int n2:nums2){
            set2.add(n2);
        }
        for(int a:nums1){
            if(set2.contains(a)) acount++;
        }
        for(int b:nums2){
            if(set1.contains(b)) bcount++;
        }
        ans[0]=acount;
        ans[1]=bcount;
        return ans;
    }
}