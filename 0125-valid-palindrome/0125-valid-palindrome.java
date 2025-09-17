class Solution {
    public boolean isPalindrome(String s) {
        // sabko lowercase me convert kar do
        s = s.toLowerCase();

        // StringBuilder use karenge kyunki string immutable hoti hai
        StringBuilder sb = new StringBuilder();

        // sirf alphanumeric characters ko append karenge
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // check: 0-9 ya a-z
            if ((ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'z')) {
                sb.append(ch);
            }
        }

        // ab palindrome check karte hain
        for (int i = 0; i < sb.length() / 2; i++) {
            if (sb.charAt(i) != sb.charAt(sb.length() - 1 - i)) {
                return false;
            }
        }

        return true; // agar sab match hua toh palindrome hai
    }
}
