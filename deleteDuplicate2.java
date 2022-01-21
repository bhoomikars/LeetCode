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
    public ListNode deleteDuplicates(ListNode head) {
      ListNode prev =new ListNode(0);
         ListNode cur=head;
        prev.next = cur;
        
       
      
        while(cur!=null && cur.next!=null)
        {
            if(cur.val==cur.next.val)
            {
                
                prev.next=cur.next;
                cur=cur.next;
              
        
            }
            else
            {
                prev=cur;
                cur=cur.next;
            }
        }
        return cur;
        
    }
}
