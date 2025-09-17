class Solution {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) return false;  // negative numbers and 0 are not powers of three

        long i = 1;
        while (i < n) {
            i = i * 3;  // multiply by 3
        }

        return i == n;
    }
}
