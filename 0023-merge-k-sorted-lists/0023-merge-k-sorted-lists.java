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
    public ListNode merge(ListNode a, ListNode b){
        ListNode head = new ListNode();
        ListNode temp = new ListNode();
        if (a.val <= b.val){
            head = a;
            a = a.next;
        }
        else{
            head = b;
            b = b.next;
        }
        temp = head;
        while (a != null && b != null){
            if (a.val <= b.val){
                temp.next = a;
                temp = temp.next;
                a = a.next;
            }
            else{
                temp.next = b;
                temp = temp.next;
                b = b.next;
            }
        }

        while (a != null){
            temp.next = a;
            temp = temp.next;
            a = a.next;
        }

        while (b != null){
            temp.next = b;
            temp = temp.next;
            b = b.next;
        }

        return head;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0)
            return null;
        if (lists.length == 1)
            return lists[0];

        int i =0;
        while (i<lists.length && lists[i] == null){
            i++;
        }
        if (i == lists.length)
            return null;
        ListNode head = lists[i];
        i++;
        for (; i<lists.length; i++){
            if (lists[i] == null)
                continue;
            head = merge(head, lists[i]);
        }

        return head;

    }
}