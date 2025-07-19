class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        int[] ans = new int[2];

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                ans[0] = left + 1;  // convert to 1-based index
                ans[1] = right + 1;
                return ans;
            } else if (sum < target) {
                left++;  // need a bigger sum
            } else {
                right--; // need a smaller sum
            }
        }

        return ans;  // Just to satisfy return type, won't reach here as per constraints
    }
}
