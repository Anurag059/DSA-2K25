class Solution {
    public int findContentChildren(int[] g, int[] s) {
        // Sort the greed factors and cookie sizes
        Arrays.sort(g); // Children’s greed factors in ascending order
        Arrays.sort(s); // Cookie sizes in ascending order
        
        int contentChildren = 0; // Count of happy kids
        int childIndex = 0; // Pointer for children
        int cookieIndex = 0; // Pointer for cookies
        
        // Loop until we run out of either children or cookies
        while (childIndex < g.length && cookieIndex < s.length) {
            // If the current cookie can satisfy the current child
            if (s[cookieIndex] >= g[childIndex]) {
                contentChildren++; // One more happy child
                childIndex++; // Move to the next child
                cookieIndex++; // Use up this cookie
            } else {
                // Cookie too small, try the next cookie
                cookieIndex++;
            }
        }
        
        return contentChildren; // Total number of content children
    }
}