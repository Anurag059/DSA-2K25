class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        
        int i = n - 1;
        for (; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                break;
            }
        }
        
        if (i != 0) {
            int index = i;
            for (int j = n - 1; j >= i; j--) {
                if (nums[j] > nums[i - 1]) {
                    index = j;
                    break;
                }
            }
            swap(nums, i - 1, index);
        }
        
        reverse(nums, i, n - 1);
    }
    
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}