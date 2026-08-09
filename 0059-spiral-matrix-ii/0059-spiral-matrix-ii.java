class Solution {
    public int[][] generateMatrix(int n) {
        int matrix [][] = new int [n][n];
        int startRow = 0, startCol =0, endRow = n-1, endCol =  n-1;
        int i =1;
        int limit = n*n;
        while (i<=limit){
            for (int j = startCol; j<=endCol; j++){
                if (i>limit)
                break;
                matrix[startRow][j] = i;
                i++;
            }
            for (int k =startRow+1; k<=endRow ; k++){
                if (i>limit)
                break;
                matrix[k][endCol] = i;
                i++;
            }
            for (int l = endCol-1; l>=startCol; l--){
                if (i>limit)
                break;
                if (startRow == endRow)
                break;
                matrix[endRow][l] = i;
                i++;
            }
            for (int m=endRow-1; m>=startRow+1; m--){
                if (i>limit)
                break;
                if (startCol == endCol)
                break;
                matrix[m][startCol] = i;
                i++;
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        return matrix;
    }
}