// Last updated: 5/25/2026, 7:08:45 PM
class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int drunk = numBottles;       // total drunk
        int empty = numBottles;       // empties after drinking all

        while (empty >= numExchange) {
            empty -= numExchange;     // spend empties
            numExchange++;            // harder next time
            drunk++;                  // you drink the new bottle
            empty++;                  // that new bottle becomes empty
        }
        return drunk;
    }
}
