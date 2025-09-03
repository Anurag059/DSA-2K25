import java.util.Arrays;

class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);  // Step 1: Sort the array
        int sum = 0;

        // Step 2: Pick every alternate element (0,2,4,...)
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];  // Add the smaller number in each pair
        }

        return sum;
    }
}
