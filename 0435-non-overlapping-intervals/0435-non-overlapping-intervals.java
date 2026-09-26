class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingDouble(o->o[1]));
        int count =0;
        int currEnd = intervals[0][1];
        for (int j =1; j<intervals.length; j++){
            if (currEnd > intervals[j][0]){
                count++;
            }
            else{
                currEnd = intervals[j][1];
            }
        }
        return count;
    }
}