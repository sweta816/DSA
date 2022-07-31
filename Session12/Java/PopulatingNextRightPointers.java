https://leetcode.com/problems/populating-next-right-pointers-in-each-node/

class Solution {
    public Node connect(Node root) {
        
        if(root==null)
        {
            return null;
        }
        
        Node curr = root;
        while(curr.left!=null)
        {
            Node nextLevel = curr.left;
            while(curr!=null)
            {
                curr.left.next = curr.right;
                if(curr.next!=null)
                {
                    curr.right.next = curr.next.left;
                }
                curr = curr.next;
            }
            curr = nextLevel;
        }
        
        return root;
        
    }
}