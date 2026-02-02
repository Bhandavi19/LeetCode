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
    public ListNode middleNode(ListNode head) {
        int cnt = 1;
        ListNode temp = head;
        while(temp.next!=null){
            cnt++;
            temp = temp.next;            
        }
        int m = cnt/2;
        temp = head;
        for(int i=0;i<m;i++){
            temp = temp.next;
        }
        return temp;
    }
}