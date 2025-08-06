class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // Traverse from last element to first
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;   // Just add 1 and return
                return digits;
            }
            digits[i] = 0;     // Set current digit to 0 and carry to next
        }

        // If all were 9, create new array with leading 1
        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;
        return newNumber;
    }
}
