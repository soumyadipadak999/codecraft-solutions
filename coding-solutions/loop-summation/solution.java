class Solution {
    public int solve(int[] nums) {
        // Write your solution here
        int sum = 0;
        for(int i : nums) {
            sum += i;
        }
        return sum;
    }
}