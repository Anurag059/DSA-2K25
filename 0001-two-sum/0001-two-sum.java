class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) { // j = i+1 to avoid i == j
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j}; // return the indices as an array
                }
            }
        }
        return new int[]{}; // return empty array if no result found
    }
}
