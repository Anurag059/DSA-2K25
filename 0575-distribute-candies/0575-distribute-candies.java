import java.util.*;
class Solution {
    public int distributeCandies(int[] candyType) {
        int n=candyType.length;
        int maxAllowed=n/2;
        Arrays.sort(candyType);
        int uniqueCount = 1;
        for (int i = 1; i < n; i++) {
            if (candyType[i] != candyType[i - 1]) {
                uniqueCount++;
            }
        }
        return Math.min(uniqueCount,maxAllowed);
        
        
    }
}