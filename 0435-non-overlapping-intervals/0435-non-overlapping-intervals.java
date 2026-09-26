class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int arr[][] = new int[intervals.length][3];
        for (int i =0; i<intervals.length; i++){
            arr[i][0] = i;
            arr[i][1] = intervals[i][0];
            arr[i][2] = intervals[i][1];
        }

        Arrays.sort(arr, Comparator.comparingDouble(o->o[2]));
        int count =0;
        int currEnd = arr[0][2];
        for (int j =1; j<intervals.length; j++){
            if (currEnd > arr[j][1]){
                count++;
            }
            else{
                currEnd = arr[j][2];
            }
        }
        return count;
    }
}