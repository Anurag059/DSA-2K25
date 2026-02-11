class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        int low = 0;
        int high = nums.length - 1;
        
        while (low < high) {
            int mid = low + (high - low) / 2;
            
            // Make mid even
            if (mid % 2 == 1) {
                mid--;
            }
            
            if (nums[mid] == nums[mid + 1]) {
                low = mid + 2; //low me answer mil gaya to low ko ab skip kr denge islye mid+2 kraa h
            } else {
                high = mid;
            }
        }
        
        return nums[low];
    }
}
