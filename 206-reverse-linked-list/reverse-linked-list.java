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
    public ListNode reverseList(ListNode head) 
    {
        ListNode tmp=head;
        ListNode pv=null;
        while(tmp!=null)
        {
            ListNode nt = tmp.next;
            tmp.next=pv;
            pv=tmp;
            tmp=nt;
        }   
        head=pv;
        return head;
    }
}