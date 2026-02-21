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
    public ListNode removeElements(ListNode head, int val) {
        ListNode d = new ListNode(0);
        d.next = head;
        ListNode prev = d;
        ListNode temp = head;
        while(temp != null){
            if(temp.val == val){
                prev.next = temp.next;
            }
            else{
                prev = temp;
            }
            temp = temp.next;
        }
        return d.next;
    }
}