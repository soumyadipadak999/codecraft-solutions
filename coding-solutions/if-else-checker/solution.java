class Solution {
    public String solve(int n) {
        // Write your solution here
        if (n > 0) {
          return "positive";
        } else if (n < 0) {
          return "negative";
        }
        return "zero";
    } 
}