class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        for (int i = 0; i < n; i++) {
            boolean[] visited = new boolean[128];
            int length = 0;
            for (int j = i; j < n; j++) {
                if (visited[s.charAt(j)]) break;
                visited[s.charAt(j)] = true;
                length++;
                maxLength = Math.max(maxLength, length);
            }
        }
        return maxLength;
    }
}