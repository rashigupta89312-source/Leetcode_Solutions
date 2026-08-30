class Solution {
    public int[][] transpose(int[][] matrix) {
        int trans[][] = new int [matrix[0].length][matrix.length];
        int m = 0;
        for(int c = 0; c < matrix[0].length; c++){
            int n = 0;
            for(int r = 0; r < matrix.length; r++){
                trans[m][n] = matrix[r][c];
                n++;
            }
            m++;
        }
        return trans;
    }
}