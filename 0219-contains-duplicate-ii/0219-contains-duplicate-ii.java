class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Check the next k elements
            for (int j = i + 1; j <= i + k && j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }

        // No duplicates found within the window
        return false;
    }
}