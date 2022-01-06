class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> subset = new ArrayList<>();
        genSubset(subset,nums,0,new ArrayList<Integer>());
        return subset;
    }
    public void genSubset(List<List<Integer>> subset , int[] nums,int index,List<Integer> subArray)
    {
        subset.add(new ArrayList<Integer>(subArray));
        for(int i=index;i<nums.length;i++)
        {
            subArray.add(nums[i]);
            genSubset(subset,nums,i+1,subArray);
             subArray.remove( subArray.size()-1);
        }
    }
}
