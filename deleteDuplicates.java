class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
       ListNode dummyNode = head;
        while(dummyNode!=null && dummyNode.next!=null)
        {
            if(dummyNode.val==dummyNode.next.val)
            {
                dummyNode.next = dummyNode.next.next;
            }
            else
            {
                dummyNode =dummyNode.next;
            }
        }
        return head;
        
        
    }
}
