// Last updated: 5/25/2026, 7:18:01 PM
class Solution {
    public List<Integer> partitionLabels(String s) {
        ArrayList<Integer> l = new ArrayList<>();
        int arr[] = new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']=i;
        }
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            end = Math.max(end, arr[s.charAt(i) - 'a']);
            if (i == end) {
                l.add(end - start + 1);
                start = i + 1;
            }
        }
        return l;
    }
}