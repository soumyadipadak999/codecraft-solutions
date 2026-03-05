class Solution {
    public String solve(int temperature) {
        if (temperature > 25) {
            return "hot";
        } else if (temperature < 10) {
            return "cold";
        } else {
            return "moderate";
        }
    }
}