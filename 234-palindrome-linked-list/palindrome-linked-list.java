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
    public boolean isPalindrome(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
       
        ListNode p=slow;
        ListNode ptr=null;
        while(p!=null){
          ListNode next=p.next;
          p.next=ptr;
          ptr=p;
          p=next;
        }
        ListNode ans=head;
      while(ptr!=null){
        if(ans.val!=ptr.val){
            return false;
        }
        ans=ans.next;
        ptr=ptr.next;
      }
      return true;
    }
}