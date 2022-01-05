// find the mid of the sorted array that is the root node
// root.left is from left to mid-1;
// root.right is mid+1 to right

class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0)
         return null;
        
    return constructBST(nums,0,nums.length-1);
        
        
    }
    
    public TreeNode constructBST(int[] nums,int left,int right)
    {
        if(left>right) return null;
        int mid = left+(right-left)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = constructBST(nums,left,mid-1);
        root.right = constructBST(nums,mid+1,right);
        return root;
        
    }
}
