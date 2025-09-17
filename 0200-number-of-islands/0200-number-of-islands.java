class Solution {
    public int numIslands(char[][] grid) {
        // yaha count rakhenge ki kitne islands mile
        int count = 0;  

        // pura grid check karenge line by line
        for (int i = 0; i < grid.length; i++) {  
            for (int j = 0; j < grid[i].length; j++) {  
                // agar '1' mila matlab land hai
                if (grid[i][j] == '1') {  
                    count++;  // ek naya island mila, count badhao  
                    callDFS(grid, i, j);  // pura island explore karne DFS call  
                }
            }
        }
        return count;  // final island count wapas bhej do
    }

    // ye DFS wala function hai jo connected land ko visit karega
    public void callDFS(char[][] grid, int i, int j) {  
        // agar bahar chale gaye ya '0' mila toh bas return
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[i].length || grid[i][j] == '0') {  
            return;
        }

        // abhi jis cell pe khade ho usko '0' kar do (visited mark)
        grid[i][j] = '0';  

        // ab 4 side ghoom ke check karo  
        callDFS(grid, i, j + 1); // right side check  
        callDFS(grid, i, j - 1); // left side check  
        callDFS(grid, i + 1, j); // niche side check  
        callDFS(grid, i - 1, j); // upar side check  
    }
}
