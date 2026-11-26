/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0)
            return null;
        if (lists.length == 1)
            return lists[0];

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i =0; i<lists.length; i++){
            ListNode head = lists[i];
            if (head == null){
                continue;
            }
            while (head != null){
                pq.add(head.val);
                head = head.next;
            }
        }

        if (pq.isEmpty())
            return null;
        else{
            ListNode ansH = new ListNode();
            ListNode ans = ansH;
            ans.val = pq.remove();
            while (!pq.isEmpty()){
                ans.next = new ListNode(pq.remove());
                ans = ans.next;
            }
            return ansH;
        }

    }
}