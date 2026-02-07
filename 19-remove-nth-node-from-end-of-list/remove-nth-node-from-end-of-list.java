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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null)return null;
        ListNode temp = head;
        int cnt = 1;
        while(temp.next != null){
            cnt++;
            temp = temp.next;
        }
        if(n==cnt){
            return head.next;
        }
        ListNode temp1 = head;
        int idx = cnt-n-1;
        for(int i=0;i<idx;i++){
            temp1 = temp1.next;
        }
        temp1.next = temp1.next.next;
        return head;
    }
}