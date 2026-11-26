class Solution {
    public class Top implements Comparable<Top>{
        int val;
        int freq;
        public Top(int val, int freq){
            this.val = val;
            this.freq = freq;
        }

        public int compareTo(Top p2){
            return p2.freq-this.freq;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int n = nums.length;

        for (int i =0; i<n; i++){
            int key = nums[i];
            if (hm.containsKey(key)){
                hm.replace(key, hm.get(key)+1);
            }
            else{
                hm.put(key, 1);
            }
        }

        PriorityQueue<Top> pq = new PriorityQueue<>();
        for (int ky: hm.keySet()){
            pq.add(new Top(ky, hm.get(ky)));
        }

        int ans[] = new int[k];
        for (int j =0; j<k; j++){
            ans[j] = pq.remove().val;
        }
        return ans;
        
    }
}