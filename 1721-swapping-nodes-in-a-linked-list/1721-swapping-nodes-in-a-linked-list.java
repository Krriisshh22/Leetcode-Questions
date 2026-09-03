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
    public ListNode swapNodes(ListNode head, int k) {
        if (head == null || head.next == null)
        return head;
        int size = 0;
        ListNode count = head;
        while (count != null){
            size++;
            count = count.next;
        }
        if (k==size)
        k=1;

        int n = size-k+1;
        if (n==k)
        return head;

        ListNode temp = new ListNode(-1);
        temp.next = head;

        ListNode left = head;
        ListNode leftP = temp;
        int i =1;
        if (n-k==1){
            while (i != k){
                leftP = left;
                left = left.next;
                i++;
            }
            ListNode right = left.next;
            leftP.next = right;
            left.next = right.next;
            right.next = left;
            return temp.next;
        }
        if (k==1){
            ListNode tailP = temp;
            while (tailP.next.next != null){
                tailP = tailP.next;
            }
            temp.next = tailP.next;
            tailP.next.next = head.next;
            head.next = null;
            tailP.next = head;
            return temp.next;
        }
        else{
            while (i != k){
                leftP = left;
                left = left.next;
                i++;
            }
            ListNode right = head;
            ListNode rightP = temp;
            i=1;
            while (i != n){
                rightP = right;
                right = right.next;
                i++;
            }
            ListNode leftN = left.next;
            ListNode rightN = right.next;

            leftP.next = right;
            right.next = leftN;
            left.next= rightN;
            rightP.next = left;
            return head;
        }
    }   
}