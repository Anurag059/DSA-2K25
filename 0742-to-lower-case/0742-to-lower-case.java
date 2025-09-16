class Solution {
    public String toLowerCase(String s) {

        //==============Solution1===============================       
        // return s.toLowerCase();


        //================Solution2========convert string to array=================        
        // char[] c = s.toCharArray();
        // for (int i = 0; i < c.length; i++) {
        //     if (c[i] >= 'A' && c[i] <= 'Z') {
        //         c[i] = (char)(c[i] + 32);
        //     }
        // }
        // return String.valueOf(c);


        //=================Solution3===========without using array=============
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                result += (char)(s.charAt(i) + 32);
            } else {
                result += s.charAt(i);
            }
        }
        return result;
    }
}
