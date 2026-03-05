class Solution {
    public int solve(Map<Integer, List<Integer>> tree) {
        // Write your solution here
       int sum = 0;

        for (int node : tree.keySet()) {
            sum += node;
        }

        return sum;
    }
}