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
    public void reorderList(ListNode head) {
         if (head == null || head.next == null) {
            return;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode ptr=null;
        ListNode p=slow.next;
        slow.next=null;
        while(p!=null){
          ListNode next=p.next;
          p.next=ptr;
          ptr=p;
          p=next;

        }
      ListNode first=head;
      ListNode second=ptr;
      while(second!=null){
        ListNode temp1=first.next;
        ListNode temp2=second.next;
        first.next=second;
        second.next=temp1;
        first=temp1;
        second=temp2;
      }
        
    }
}