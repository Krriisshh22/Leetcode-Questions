class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> ll= new ArrayList<>();
        int startRow = 0;
        int endRow = matrix.length-1;
        int startCol =0;
        int endCol = matrix[0].length-1;
        while (startRow<=endRow && startCol<=endCol){
            for (int i =startCol; i<=endCol; i++){
                ll.add(matrix[startRow][i]);
            }
            for (int j =startRow+1; j<=endRow ; j++){
                ll.add(matrix[j][endCol]);
            }
            for (int k= endCol-1; k>=startCol ; k--){
                if (startRow==endRow)
                break;
                ll.add(matrix[endRow][k]);
            }
            for (int l=endRow-1; l>=startRow+1; l--){
                if (startCol == endCol)
                break;
                ll.add(matrix[l][startCol]);
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        return ll;

    }
}