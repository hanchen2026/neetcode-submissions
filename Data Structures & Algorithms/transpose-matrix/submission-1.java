class Solution {
    public int[][] transpose(int[][] matrix) {
        // m x n matrix = row x col
        int row = matrix.length;    
        int col = matrix[0].length;

        //reverse it, mxn ==> nxm
        int[][] result = new int[col][row];

        for(int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                if (i == j) result[i][j] = matrix[i][j];
                else result[i][j] = matrix[j][i];
            }
        }

        return result;
    }
}