class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
         if(root==null)
            return false;
        Stack<TreeNode> treeNodes = new Stack<>();
        Stack<Integer> sum_stak = new Stack<>();
        treeNodes.add(root);
        sum_stak.add(targetSum-root.val);
        while(!treeNodes.isEmpty())
        {
            TreeNode cur = treeNodes.pop();
            int curSum= sum_stak.pop();
            if(cur.left==null && cur.right==null && curSum==0)
            {
                return true;
            }

            if(cur.left!=null)
            {
                treeNodes.add(cur.left);
                sum_stak.add(curSum-cur.left.val);
            }

            if(cur.right!=null)
            {
                treeNodes.add(cur.right);
                sum_stak.add(curSum-cur.right.val);
            }
        }
        return false;
    }
    
}
