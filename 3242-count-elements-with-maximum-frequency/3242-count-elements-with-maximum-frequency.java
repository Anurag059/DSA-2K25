class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] freq = new int[101]; 
        
        // Count frequencies
        for (int num : nums) {
            freq[num]++;
        }

        // Find max frequency
        int maxFreq = 0;
        for (int f : freq) {
            maxFreq = Math.max(maxFreq, f);
        }

        // Count total elements with max frequency
        int result = 0;
        for (int f : freq) {
            if (f == maxFreq) {
                result += f;
            }
        }

        return result;
    }
}
