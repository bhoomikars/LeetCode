/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
Base conditions 
1.if node to be deleted is having left child only then return right side
2. if node to be deleted is having right child only then return left side
3. if having both then go to right fine min val then make root value that delete the right side value 





class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        
        if(root==null)
            return null;
        if(key<root.val)
            root.left=deleteNode(root.left,key);
        else if(key>root.val)
            root.right=deleteNode(root.right,key);
        else
        {
            if(root.left==null)
                return root.right;
            else if(root.right==null)
                return root.left;
            
               root.val = findMinRightTree(root.right);
              
                root.right=deleteNode(root.right,root.val);
            
        }
        return root;
    }
    public int findMinRightTree(TreeNode root)
    {
        int min=root.val;
        while(root.left!=null)
        {
            min=root.left.val;
            root=root.left;
        }
        return min;
    }
}
