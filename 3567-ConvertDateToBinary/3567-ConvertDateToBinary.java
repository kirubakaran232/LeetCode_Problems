// Last updated: 5/25/2026, 7:07:57 PM
class Solution {
    public String convertDateToBinary(String date) {
        StringBuilder s = new StringBuilder();
        s.append(Integer.toBinaryString(Integer.parseInt(date.substring(0, 4))));
        s.append("-");
        s.append(Integer.toBinaryString(Integer.parseInt(date.substring(5, 7))));
        s.append("-");
        s.append(Integer.toBinaryString(Integer.parseInt(date.substring(8))));
        return s.toString();
    }
}