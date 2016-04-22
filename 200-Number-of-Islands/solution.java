public class Solution {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0){
            return 0;
        }
        
        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(grid[i][j] == '1'){
                    count += 1;
                    removeIsland(grid, i, j);
                }
            }
        }
        return count;
    }
    
    private void removeIsland(char[][] grid, int row, int col){
        grid[row][col] = '0';
        int[] dx = new int[4];
        int[] dy = new int[4];
        dx[0] = dy[3] = 0;
        dx[1] = dy[2] = 0;
        dx[2] = dy[1] = 1;
        dx[3] = dy[0] = -1;
        for(int i = 0; i < 4; i++){
            int x = row + dx[i];
            int y = col + dy[i];
            if (isValidPos(grid, x, y) && grid[x][y] == '1'){
                removeIsland(grid, x, y);
            }
        }
    }
    
    private boolean isValidPos(char[][] grid, int x, int y){
        int rows = grid.length;
        int cols = grid[0].length;
        boolean xIsValid = (0 <= x && x <= rows - 1);
        boolean yIsValid = (0 <= y && y <= cols - 1);
        return xIsValid && yIsValid;
    }
    
}