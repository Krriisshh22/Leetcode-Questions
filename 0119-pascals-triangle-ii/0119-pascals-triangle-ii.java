class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = rowIndex;
        for (int i =0; i<=n; i++){
            List<Integer> row = new ArrayList<>(Collections.nCopies(i+1, 1));

            for (int j =1; j<i; j++){
                int val = ans.get(i-1).get(j-1) + ans.get(i-1).get(j);
                row.set(j, val);
            }
            ans.add(row);
        }
        return ans.get(n);

    }
}