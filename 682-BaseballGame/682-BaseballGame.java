// Last updated: 5/25/2026, 7:18:24 PM
import java.util.*;

class Solution {
    public int calPoints(String[] ops) {
        List<Integer> scores = new ArrayList<>();
        
        for (String s : ops) {
            if (s.equals("+")) {
                int size = scores.size();
                scores.add(scores.get(size - 1) + scores.get(size - 2));
            } else if (s.equals("D")) {
                scores.add(2 * scores.get(scores.size() - 1));
            } else if (s.equals("C")) {
                scores.remove(scores.size() - 1);
            } else {
                scores.add(Integer.parseInt(s));
            }
        }
        
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return sum;
    }
}
