class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        double currSum = 0;

        // Compute the sum of the first k elements
        for (int i = 0; i < k; i++) {
            currSum += nums[i];
        }

        double maxSum = currSum;

        // Slide the window across the array
        for (int i = k; i < n; i++) {
            currSum = currSum - nums[i - k] + nums[i];
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum / k;
    }
}
