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
    public void reorderList(ListNode head) {
        if (head == null || head.next == null)
        return ;

        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode rightH = slow.next;
        slow.next = null;

        ListNode curr = rightH;
        rightH = null;

        while (curr != null){
            ListNode next = curr.next;
            curr.next = rightH;
            rightH = curr;
            curr = next;
        }

        ListNode i = head;
        ListNode j = rightH;

        while (j != null){
            ListNode nextI = i.next;
            ListNode nextJ = j.next;
            i.next=j;
            j.next = nextI;

            i = nextI;
            j = nextJ;
        }
    }   
}