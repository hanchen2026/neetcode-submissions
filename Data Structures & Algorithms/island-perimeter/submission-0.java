class Solution {
    public int islandPerimeter(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    return dfs(grid, i, j);
                }
            }
        }

        //if none is a 1, we are at sea brothermans
        return 0;
    }

    private int dfs(int[][] grid, int i, int j) {
        //if out of bounds, or grid value is 0, return 1
        //note that seeing a 1 at grid[i][j] doesnt return 1, you just overwrite it later
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0) return 1;

        //if seen already, dont count again
        if (grid[i][j] == -1) return 0;

        //overwrite nodes with 1's, they cant count anyways for perimeter
        grid[i][j] = -1;

        //dfs across the 4 cardinal directions in 1U each
        return dfs(grid, i-1, j) + dfs(grid, i, j-1) + dfs(grid, i+1, j) + dfs(grid, i, j+1);
    }
}