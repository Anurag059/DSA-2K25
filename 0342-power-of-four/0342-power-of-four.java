class Solution {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) return false;  // negative numbers and 0 are not powers of four

        long i = 1;
        while (i < n) {
            i = i * 4;  // multiply by 4
        }

        return i == n;
    }
}
