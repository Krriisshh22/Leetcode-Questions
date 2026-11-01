class Solution {
    public void set(int matrix[][], int r, int c){
        for (int i = 0; i<matrix[0].length; i++){
            matrix[r][i] = 0;
        }
        for (int j = 0; j < matrix.length; j++){
            matrix[j][c] = 0;
        }
    }
    public void setZeroes(int[][] matrix) {
        ArrayList<Integer> rl = new ArrayList<>();
        ArrayList<Integer> cl = new ArrayList<>();
        int r = matrix.length;
        int c = matrix[0].length;
        for (int i =0; i < r; i++){
            for (int j = 0; j < c; j++){
                if (matrix[i][j] == 0){
                    rl.add(i);
                    cl.add(j);
                }
            }
        }

        for (int k = 0; k<rl.size(); k++){
            set(matrix, rl.get(k), cl.get(k));
        }
        rl.clear();
        cl.clear();
    }
}