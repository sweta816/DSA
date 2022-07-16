https://leetcode.com/problems/remove-duplicates-from-sorted-list/

class Solution {
public:
    ListNode* deleteDuplicates(ListNode* head) {
        
        if(head==NULL)
        {
            return NULL;
        }
        
        ListNode* itr = head;
        
        while(itr->next!=NULL)
        {
            if(itr->val == itr->next->val)
            {
                itr->next = itr->next->next;
            }
            else
            {
                itr = itr->next;
            }
        }
        
        return head;
        
    }
};