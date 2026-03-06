class Solution {
    public int solve(int[] nums) {
       int max = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num <= 0) {
                return 0;
            }
            if (num > max) {
                max = num;
            }
        }

        return max;
    }
}