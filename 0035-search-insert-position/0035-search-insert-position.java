class Solution {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) { // if we find equal or greater value
                return i;
            }
        }
        return nums.length; // insert at the end
    }
}
