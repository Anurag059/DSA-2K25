class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxConsecutiveOnes = 0;
        int currentConsecutiveOnes = 0;

        // Normal for loop (index based)
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                currentConsecutiveOnes++; // agar 1 mila toh count badhao
            } else {
                maxConsecutiveOnes = Math.max(maxConsecutiveOnes, currentConsecutiveOnes);
                currentConsecutiveOnes = 0; // reset
            }
        }

        // Agar array 1s pe khatam hota hai toh us case ko handle karna
        maxConsecutiveOnes = Math.max(maxConsecutiveOnes, currentConsecutiveOnes);

        return maxConsecutiveOnes;
    }
}