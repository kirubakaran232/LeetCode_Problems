// Last updated: 5/25/2026, 7:09:00 PM
class Solution {
    public List<Integer> findPeaks(int[] m) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < m.length - 1; i++) 
            if (m[i - 1] < m[i] && m[i] > m[i + 1])
                list.add(i);
        return list;
    }
}