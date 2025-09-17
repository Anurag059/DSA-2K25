class Solution {
    public int[] searchRange(int[] nums, int target) {
        // starting me maan lete hain ki target mila hi nahi
        int first = -1, last = -1;  

        // pura array traverse karenge
        for (int i = 0; i < nums.length; i++) {
            // agar element target ke equal mila
            if (nums[i] == target) {
                // agar pehli baar mila toh first index set karo
                if (first == -1) {
                    first = i;
                }
                // har baar jab milega, last update karte jao
                last = i;
            }
        }

        // answer array me first aur last index bhej do
        return new int[]{first, last};
    }
}
