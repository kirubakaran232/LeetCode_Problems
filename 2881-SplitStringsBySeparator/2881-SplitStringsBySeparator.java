// Last updated: 5/25/2026, 7:09:34 PM
class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> result = new ArrayList<>();
        for (String str : words) {
            String[] parts = str.split("\\" + separator);
            for (String p : parts) {
                if (!p.isEmpty()) {
                    result.add(p);
                }
            }
        }
        return result;
    }
}
