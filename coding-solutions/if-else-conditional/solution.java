class Solution {
    public String solve(int n) {
        // Write your solution here
        if (n == 0) 
        {
            return "zero";
        } else {
            if (n % 2 ==0) {
                return "even";
            } else {
                return "odd";
            }
        }
      }
}