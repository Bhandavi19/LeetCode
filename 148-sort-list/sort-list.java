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
    public ListNode sortList(ListNode head) {
        ArrayList<Integer> l = new ArrayList<>();
        if(head == null) return null;
        ListNode temp = head;
        while(temp!= null){
            l.add(temp.val);
            temp = temp.next;
        }
        Collections.sort(l);
        temp = head;
        int i=0;
        while(temp != null){
            temp.val = l.get(i++);
            
            temp = temp.next;
        }
        return head;
    }
}