class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        // int[] map1 = new int[256];
        // int[] map2 = new int[256];
        
        // for (int i = 0; i < s.length(); i++) {
            
        //     if (map1[s.charAt(i)] != map2[t.charAt(i)])
        //         return false;
            
        //     map1[s.charAt(i)] = i + 1;
        //     map2[t.charAt(i)] = i + 1;
        // }
        
        // return true;




        //---------------------------------------------
          if (s.length() != t.length()) return false;
        
        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            
            if (map1.containsKey(c1)) {
                if (map1.get(c1) != c2)
                    return false;
            } else {
                map1.put(c1, c2);
            }
            
            if (map2.containsKey(c2)) {
                if (map2.get(c2) != c1)
                    return false;
            } else {
                map2.put(c2, c1);
            }
        }
        
        return true;

    }
}
