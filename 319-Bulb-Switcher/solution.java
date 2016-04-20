public class Solution {
    public int bulbSwitch(int n) {
        // all bulbs that at ith position will be on, where sqrt(i) is a integer.
        // like i = 1, 4, 9, 16, 25 .....
        return (int)Math.sqrt(n);
    }
}