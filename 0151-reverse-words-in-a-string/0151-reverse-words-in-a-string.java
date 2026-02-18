class Solution {
    public String reverseWords(String s) {
        String result = "";
        String word = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);

            if (ch == ' ') {
                if (!word.equals("")) {
                    result = result + word + " ";
                    word = "";   // FIXED
                }
            } else {
                word = ch + word;
            }
        }

        if (!word.equals("")) {
            result = result + word;
        }

        return result.trim();
    }
}