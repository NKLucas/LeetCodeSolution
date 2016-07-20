public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0){
            return false;
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        int row = searchRow(matrix, target);
        if (row < 0 || row >= rows){
            return false;
        }
        int col = searchCol(matrix, row, target);
        if (col == -1){
            return false;
        }
        return true;
    }
    
    private int searchRow(int[][] matrix, int target){
        int rows = matrix.length;
        int result = -1;
        int low = 0;
        int high = rows - 1;
        while(low < high - 1){
            int half = (low + high) / 2;
            if (matrix[half][0] == target){
                return half;
            } else if (matrix[half][0] > target){
                high = half;
            } else {
                low = half;
            }
        }
        if (matrix[low][0] > target){
            return -1;
        } 
        if (matrix[high][0] > target){
            return low;
        } else {
            return high;
        }
        
    }
    
    private int searchCol(int[][] matrix, int row, int target){
        int cols = matrix[0].length;
        int low = 0;
        int high = cols - 1;
        while(low < high - 1){
            int half = (low + high) / 2;
            if(matrix[row][half] == target){
                return half;
            } else if (matrix[row][half] > target){
                high = half;
            } else {
                low = half;
            }
        }
        if (matrix[row][low] == target){
            return low;
        }
        if (matrix[row][high] == target){
            return high;
        }
        return -1;
    }
}