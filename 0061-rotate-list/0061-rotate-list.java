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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null)
        return head;
        ListNode tail = head;
        ListNode temp = head;
        ListNode tempC = head;
        int size = 0;
        while (tempC != null){
            size++;
            tempC = tempC.next;
        }
        if (k%size == 0)
        return head;
        int idx = size-(k%size);

        while (tail.next != null){
            tail = tail.next;
        }

        for (int i =1; i<idx; i++){
            temp = temp.next;
        }

        ListNode newHead = temp.next;
        tail.next = head;
        head = newHead;
        temp.next = null;

        return head;
    }
}