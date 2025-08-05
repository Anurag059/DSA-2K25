class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0; // edge case

        int i = 0; // slow pointer

        for (int j = 1; j < nums.length; j++) { // fast pointer
            if (nums[j] != nums[i]) { 
                i++; // move slow pointer
                nums[i] = nums[j]; // copy unique value
            }
        }

        return i + 1; // number of unique elements
    }
}
