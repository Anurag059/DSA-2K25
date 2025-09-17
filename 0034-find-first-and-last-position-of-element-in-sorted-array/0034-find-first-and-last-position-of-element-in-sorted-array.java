class Solution {
    public int[] searchRange(int[] nums, int target) {
        // // starting me maan lete hain ki target mila hi nahi
        // int first = -1, last = -1;  

        // // pura array traverse karenge
        // for (int i = 0; i < nums.length; i++) {
        //     // agar element target ke equal mila
        //     if (nums[i] == target) {
        //         // agar pehli baar mila toh first index set karo
        //         if (first == -1) {
        //             first = i;
        //         }
        //         // har baar jab milega, last update karte jao
        //         last = i;
        //     }
        // }

        // // answer array me first aur last index bhej do
        // return new int[]{first, last};


        //=========Binary search==================
        int result[] = new int[2]; // yaha pe first aur last index store hoga

        // agar array empty hai toh sidha return
        if (nums.length == 0) {
            return new int[]{-1, -1};
        }

        // ===== First index ke liye binary search =====
        int low = 0, high = nums.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2; // mid nikal lo
            if (nums[mid] < target) {
                // agar mid value chhoti hai toh right side jao
                low = mid + 1;
            } else {
                // warna left me search karo (ya mid pe ruko)
                high = mid;
            }
        }

        // agar target mila hi nahi
        if (nums[low] != target) {
            return new int[]{-1, -1};
        }

        // yaha tak aaya matlab first index mil gaya
        result[0] = low;

        // ===== Last index ke liye binary search =====
        high = nums.length; // last search ke liye high ko end pe le jao
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] <= target) {
                // agar target ya chhoti value hai toh right side jao
                low = mid + 1;
            } else {
                // warna left side me aao
                high = mid;
            }
        }

        // loop ke baad low ek step aage chala gaya, isliye last = low-1
        result[1] = low - 1;

        return result; // dono index return
    }
}
