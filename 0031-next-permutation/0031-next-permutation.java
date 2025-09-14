class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        
        int i = n - 1;
        // Step 1: दाएँ से पहला ऐसा index ढूँढो जहाँ nums[i] > nums[i-1] हो
        while (i > 0 && nums[i] <= nums[i - 1]) {
            i--;
        }

        if (i != 0) {
            int index = i;
            // Step 2: दाएँ से ऐसा element ढूँढो जो nums[i-1] से बड़ा हो
            for (int j = n - 1; j >= i; j--) {
                if (nums[j] > nums[i - 1]) {
                    index = j;
                    break;
                }
            }
            // Step 3: nums[i-1] और nums[index] को swap करो
            swap(nums, i - 1, index);
        }

        // Step 4: i से लेकर end तक वाले array को reverse करो
        reverse(nums, i, n - 1);
    }

    // दो elements को swap करने के लिए helper function
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // array के एक हिस्से को उल्टा करने के लिए helper function
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    // टेस्ट करने के लिए main method
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1, 2, 3};

        sol.nextPermutation(nums);

        // Output print
        for (int num : nums) {
            System.out.print(num + " ");
        }
        // Output होना चाहिए: 1 3 2
    }
}
