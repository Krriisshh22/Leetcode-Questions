class Solution {
    public boolean check(int[] nums) {
        int idx = 0;
        for (int i =nums.length-1; i>0; i--){
            if (i != 0 && nums[i-1]>nums[i]){
                idx = nums.length-i;;
                break;
            }
        }

        int arr[] = new int[nums.length];
        for (int i =0; i<nums.length; i++){
            arr[i] = nums[i];
        }

        Arrays.sort(arr);

        for (int j =0; j<nums.length; j++){
            if (nums[j] != arr[(j+idx) % (nums.length)])
            return false;
        }

        return true;
    }
}