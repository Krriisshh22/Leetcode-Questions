class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> l = new ArrayList<>();
        int i =0, n = intervals.length;
        while (i<n && intervals[i][1] < newInterval[0]){
            l.add(intervals[i]);
            i++;
        }
        
        while (i<n && intervals[i][0] <= newInterval[1]){
            newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
            i++;
        }
        l.add(newInterval);

        while (i<n){
            l.add(intervals[i]);
            i++;
        }

        return l.toArray(new int[l.size()][]);
    }
}