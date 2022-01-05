// Min of right and left subTree , if it skewed BT then it is Max of left and right sub tree


class Solution {
    public int minDepth(TreeNode root) {
        if(root==null) 
            return 0;
        
        int left = minDepth(root.left);
        int right = minDepth(root.right);
    
      if(root.left==null || root.right==null)
      {
          return Math.max(left,right)+1;
      }
        return Math.min(left,right)+1;
        
    }
}
