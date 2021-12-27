public class MaximumSubArray
{
    public static void main (String[] args)
    {
        int[] a ={-2};
        System.out.println(maxSubArray(a));
    }
    public static int maxSubArray(int[] nums) {
       int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i =0;i<nums.length;i++)
        {
            sum = sum+nums[i];
            max = Math.max(max,sum);
            if(sum<0) sum = 0;

        }
return max;
    }
}
