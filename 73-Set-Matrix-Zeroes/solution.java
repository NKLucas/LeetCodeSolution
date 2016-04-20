public class Solution {
    public void setZeroes(int[][] matrix) {
        boolean firstRowZero = false;
        boolean firstColZero = false;
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        // record is there any 0s in first row or first col.
        // because the first row and col will be used to record the 0s position inside of the matrix.
        for (int i = 0; i < cols; i++){
            if (matrix[0][i] == 0){
                firstRowZero = true;
                break;
            }
        }
        
        for (int i = 0; i < rows; i++){
            if(matrix[i][0] == 0){
                firstColZero = true;
                break;
            }
        }
        
        // find 0s and record the x,y to the first row and first col.
        for (int row = 0; row < rows; row++){
            for(int col = 0; col < cols; col++){
                if (matrix[row][col] == 0){
                    matrix[row][0] = 0;
                    matrix[0][col] = 0;
                }
            }
        }
        
        // set the values to 0 if the row and col are recorded, except the first row and the first col.
        for (int row = 1; row < rows; row++){
            for(int col = 1; col < cols; col++){
                if(matrix[row][0] == 0 || matrix[0][col] == 0){
                    matrix[row][col] = 0;
                }
            }
        }
        
        // handling the first row and first col.
        if (firstRowZero){
            for (int i = 0; i < cols; i++){
                matrix[0][i] = 0;
            }
        }
        
        if(firstColZero){
            for (int i = 0; i < rows; i++){
                matrix[i][0] = 0;
            }
        }
    }
}