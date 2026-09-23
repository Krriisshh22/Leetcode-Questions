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
    public ArrayList<Integer> rev (ArrayList<Integer> l, int a, int b){
        int i = a, j = b;
        while (i<j){
            int temp = l.get(i);
            l.set(i, l.get(j));
            l.set(j, temp);
            i++;
            j--;
        }
        return l;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ArrayList<Integer> l = new ArrayList<>();

        while (temp != null){
            l.add(temp.val);
            temp = temp.next;
        }

        int i =0, j=k-1;
        while (j<l.size()){
            l = rev(l, i, j);
            i += k;
            j += k;
        }
        
        temp = head;
        while (temp != null){
            temp.val = l.remove(0);
            temp = temp.next;
        }

        return head;
    }
}