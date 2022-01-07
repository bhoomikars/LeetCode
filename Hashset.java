class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
     
    HashSet<Integer> set = new HashSet<Integer>();
        for(int i:nums1)
        {
            set.add(i);
        }
        HashSet<Integer> resultSet = new HashSet<Integer>();
        for(int i :nums2)
        {
            if(set.contains(i))
                resultSet.add(i);
        }

        int[] res = new int[resultSet.size()];int j=0;
        for(int i:resultSet)
        {
            res[j++]=i;
        }
        return  res;
        
    }
}
