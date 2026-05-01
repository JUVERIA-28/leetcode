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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || left==right){
            return head;
        }
        if(left==1){
            return reverse(head,right);
        }
        ListNode prev=head;
        for(int i=1;i<left-1;i++){
            prev=prev.next;
        }
        prev.next=reverse(prev.next,right-left+1);
        return head;
        
    }
    public ListNode reverse(ListNode head,int n){
        ListNode prev=null;
        ListNode cur=head;
        while(n-->0){
            ListNode nn=cur.next;
            cur.next=prev;
            prev=cur;
            cur=nn;
        }
        head.next=cur;
        return prev;
    }
}