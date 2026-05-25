// Last updated: 5/25/2026, 7:16:37 PM
class Solution {
    public String defangIPaddr(String address) {
        address=address.replace(".","[.]");
        return address;
    }
}