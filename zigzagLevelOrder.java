public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean LTR= true;
        while (!queue.isEmpty())
        {
            List<Integer> curList = new ArrayList<>();
            int size = queue.size();
            for(int i=0;i<size;i++)
            {
                TreeNode curNode = queue.poll();
                if(LTR)
                {
                    curList.add(curNode.val);
                }
                else
                {
                    curList.add(0, curNode.val);
                }
                if(curNode.left!=null) queue.add(curNode.left);
                if(curNode.right!=null) queue.add(curNode.right);

            }
            result.add(curList);
            LTR=!LTR;
        }
        return result;


    }
