class Solution(object):
    def minPathSum(self, grid):
        """
        :type grid: List[List[int]]
        :rtype: int
        """
        result = grid[:]
        row_length = len(grid)
        col_length = len(grid[0])
        if row_length == 0:
            return grid
        for col in range(1, col_length):
            result[0][col] += result[0][col-1]
        for row in range(1, row_length):
            result[row][0] += result[row-1][0]
        
        for row in range(1, row_length):
            for col in range(1, col_length):
                result[row][col] += min(result[row-1][col], result[row][col-1])
        return result[row_length -1][col_length - 1]
        
        
