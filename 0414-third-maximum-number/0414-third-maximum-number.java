import java.util.*;

class Solution {
    public int thirdMax(int[] nums) {
        // Step 1: Array ko sort karo (छोटे से बड़े तक)
        Arrays.sort(nums);

        // Step 2: unique (alag) numbers count karne ke liye
        int count = 1; // abhi tak 1 unique mila (sabse bada)
        int last = nums[nums.length - 1]; // sabse bada number

        // Step 3: piche se check karna start karo
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] != last) { // agar naya number mila (alag)
                count++;
                last = nums[i]; // update last number
            }
            if (count == 3) {
                // agar 3 unique number mil gaye toh wahi return karo
                return nums[i];
            }
        }

        // Step 4: agar 3 unique nahi mile toh sabse bada return karo
        return nums[nums.length - 1];
    }
}
