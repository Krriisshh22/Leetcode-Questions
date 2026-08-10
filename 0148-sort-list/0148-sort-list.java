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
    public ListNode mid (ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public ListNode merge (ListNode left, ListNode right){
        ListNode mergedLL = new ListNode(-1);
        ListNode temp = mergedLL;
         while (left != null && right != null){
            if (left.val <= right.val){
                temp.next = left;
                left = left.next;
                temp = temp.next; 
            }
            else{
                temp.next = right;
                right = right.next;
                temp = temp.next;       
            }
         }
         while (left != null){
            temp.next = left;
            left = left.next;
            temp = temp.next;   
         }
         while (right != null){
            temp.next = right;
            right = right.next;
            temp = temp.next;   
         }
         return mergedLL.next;
    }
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null)
        return head;
        ListNode mid = mid(head);
        ListNode rightHead = mid.next;
        mid.next = null;

        ListNode newLeft = sortList (head);
        ListNode newRight = sortList (rightHead);

        return merge(newLeft, newRight);
    }
}