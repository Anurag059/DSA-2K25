class Solution {
    public void reverseString(char[] s) {
        int left = 0; // Start pointer
        int right = s.length - 1; // End pointer

        while (left < right) {
            // Swap characters at left and right pointers
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            // Move towards the middle
            left++;
            right--;
        }
    }
}
