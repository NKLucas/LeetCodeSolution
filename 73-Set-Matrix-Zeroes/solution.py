class Solution(object):
    def setZeroes(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: void Do not return anything, modify matrix in-place instead.
        """
        row = []
        col = []
        rows = len(matrix)
        cols = len(matrix[0])
        
        for i in range(rows):
            for j in range(cols):
                if matrix[i][j] == 0:
                    row.append(i)
                    col.append(j)
        for i in row:
            for k in range(cols):
                matrix[i][k] = 0
                
        for j in col:
            for k in range(rows):
                matrix[k][j] = 0
        
        
        