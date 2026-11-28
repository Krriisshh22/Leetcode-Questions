class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0)
            return 0;
        int max = 1;
        HashSet<Integer> set = new HashSet<>();

        int n = nums.length;
        for (int i = 0; i<n; i++){
            set.add(nums[i]);
        }
        
        for (Integer i : set){
            if (!set.contains(i-1)){
                int count = 1;
                int j = i+1;
                while(set.contains(j)){
                    count++;
                    j++;
                }
                max = Math.max(count, max);
            }
        }
        return max;
    }
}