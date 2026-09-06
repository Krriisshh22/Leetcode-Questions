class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans[] = new int [nums2.length];
        int ans2[] = new int [nums1.length];
        Stack<Integer> s = new Stack<>();
        for (int i =nums2.length-1; i>=0; i--){
            while (!s.empty() && nums2[s.peek()] <= nums2[i]){
                s.pop();
            }

            if (s.empty())
            ans[i] = -1;
            else
            ans[i] = nums2[s.peek()];

            s.push(i);
        }
        for (int j =0; j<nums1.length; j++){
            int k =0;
            while (nums1[j] != nums2[k]){
                k++;
            }
            ans2[j] = ans[k];
        }

        return ans2;
    }
}