class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int matrix[][] = new int[m][n];
        for(int i = 0; i < indices.length ; i++){
            int ri = indices[i][0];
            int ci = indices[i][1];
            for(int c = 0; c < n; c++){
                matrix[ri][c]++;
            }
            for(int r = 0; r < m; r++){
                matrix[r][ci]++;
            }
        }
        int odd = 0;
        for(int r = 0; r < m; r++){
            for(int c = 0; c < n; c++){
                if(matrix[r][c] % 2 != 0){
                    odd++;
                }
            }
        }
        return odd;
    }
}