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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || right == left )
        return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode temp = dummy;
        ListNode newH= head;
        ListNode newT = head;
        
        int i =1;
        while (i<left){
            temp= newH;
            newH = newH.next;
            i++;
        }

        int j = 1;
        while (j<right){
            newT = newT.next;
            j++;
        }

        ListNode after = newT.next;
        ListNode prev = after;
        ListNode curr = newH;

        while (curr != after){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        temp.next = prev;
        return dummy.next;
    }   
}