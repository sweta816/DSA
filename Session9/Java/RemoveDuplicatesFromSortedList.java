https://leetcode.com/problems/remove-duplicates-from-sorted-list/

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        if(head==null)
        {
            return null;
        }
        
        ListNode itr = head;
        
        while(itr.next!=null)
        {
            if(itr.val == itr.next.val)
            {
                itr.next = itr.next.next;
            }
            else
            {
                itr = itr.next;
            }
        }
        
        return head;
        
    }
}