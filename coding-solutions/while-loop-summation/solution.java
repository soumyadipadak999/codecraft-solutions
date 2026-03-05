class Solution {
    public int solve(int[] nums) {
        int sum = 0;
        int i = 0;
        while (i < nums.length) {
            // Write your solution here
            sum += nums[i++];
        }
        return sum;
    }
}