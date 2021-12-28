**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode sr = head;
        ListNode fr = head;
        while(fr!=null && fr.next!=null)
        {
            sr = sr.next;
            fr = fr.next.next;
            if(sr==fr)
                break;
         }
        if(fr==null || fr.next==null)
            return null;
        sr = head;
        while(sr!=fr)
        {
            sr = sr.next;
            fr = fr.next;
        }
        return sr;
        
    }
}
