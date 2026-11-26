class Solution {
    public int[] arrayRankTransform(int[] arr) {
        if (arr.length == 0)
            return new int[] {};
        int n = arr.length;
        int temp[] = new int[n];
        for (int i =0; i<n; i++){
            temp[i] = arr[i];
        }
        Arrays.sort(temp);

        HashMap<Integer, Integer> rank = new HashMap<>();
        rank.put(temp[0], 1);
        int idx =2;
        for (int j =1; j<n; j++){
            if (rank.containsKey(temp[j]))
                continue;
            rank.put(temp[j], idx);
            idx++;
        }

        int ans[] = new int[n];
        for (int i =0; i<n; i++){
            ans[i] = rank.get(arr[i]);
        }
        return ans;
    }
}