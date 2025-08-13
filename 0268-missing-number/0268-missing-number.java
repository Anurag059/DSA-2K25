class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;

        // Check each number from 0 to n
        for (int number = 0; number <= n; number++) {
            boolean found = false;

            // Search for this number in nums
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == number) {
                    found = true;
                    break; // Stop searching if found
                }
            }

            // If not found, it's the missing number
            if (!found) {
                return number;
            }
        }
        return -1; // Should never reach here
    }
}
