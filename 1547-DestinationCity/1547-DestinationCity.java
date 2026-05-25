// Last updated: 5/25/2026, 7:15:13 PM
class Solution {
    public String destCity(List<List<String>> paths) {

        Set<String> start = new HashSet<>(paths.size());

        for (List<String> path : paths) {
            start.add(path.get(0));
        }

        for (List<String> path : paths) {
            String p = path.get(1);
            if (!start.contains(p)) {
                return p;
            }
        }

        return "";
    }
}