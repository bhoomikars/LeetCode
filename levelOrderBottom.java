class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root==null)
            return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
            while(!queue.isEmpty())
            {
                int size = queue.size();

                List<Integer> curList = new ArrayList<>();
                for(int i=0;i<size;i++)
                {
                    TreeNode cur = queue.remove();
                    curList.add(cur.val);
                    if(cur.left!=null)
                    {
                        queue.add(cur.left);
                    }
                    if(cur.right!=null)
                    {
                        queue.add(cur.right);
                    }
                }
                res.add(curList);
            }
        Collections.reverse(res);
            return res;
    }
}
