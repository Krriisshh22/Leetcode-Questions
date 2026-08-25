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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null)
        return head;
        ListNode curr = head;
        ListNode prev = head;
        while (curr.next!= null){
            if (curr.val == curr.next.val){
                ListNode temp = curr.next;
                while (temp != null && temp.val == curr.val ){
                    temp = temp.next;
                }
                if (prev == head && prev.val == prev.next.val){
                    head = temp;
                    curr = temp;
                    prev = temp;
                }
                else{
                    prev.next = temp;
                    curr = temp;
                }

            }
            else{
                prev = curr;
                curr = curr.next;
            }
            if (curr == null)
            return head;
        }
        return head;
    }
}