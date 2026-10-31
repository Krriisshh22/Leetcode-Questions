class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int startR =0, startC = 0, endR = matrix.length-1, endC = matrix[0].length-1;
        List<Integer> l = new ArrayList<>();

        while (startR <= endR && startC <= endC){
            for (int i = startC; i<= endC; i++){
                l.add(matrix[startR][i]);
            }
            for (int j = startR+1; j<=endR; j++){
                l.add(matrix[j][endC]);
            }
            for (int k = endC-1; k>=startC; k--){
                if (startR == endR)
                    break;
                l.add(matrix[endR][k]);
            }
            for (int m = endR-1; m>startR; m--){
                if (startC == endC)
                    break;
                l.add(matrix[m][startC]);
            }
            startR++;
            endR--;
            startC++;
            endC--;
        }
        return l;
    }
}