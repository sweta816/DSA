https://leetcode.com/problems/two-sum-iv-input-is-a-bst/

class Solution {
    
    void inorderT(TreeNode root, List<Integer> values)
    {
        if(root==null)
        {
            return;
        }
        inorderT(root.left, values);
        values.add(root.val);
        inorderT(root.right, values);
    }
    
    public boolean findTarget(TreeNode root, int k) {
        
        List<Integer> values = new ArrayList<Integer>();
        inorderT(root, values);
        
        int i = 0;
        int j = values.size()-1;
        
        while(i<j)
        {
            if(values.get(i)+values.get(j)==k)
            {
                return true;
            }
            else if(values.get(i)+values.get(j) > k)
            {
                j--;
            }
            else
            {
                i++;
            }
        }
        
        return false;
        
    }
}