// given sorted array
// 1 2 3
// mid = 2
// if 1 is target
//  1<2
// target<mid
// h =mid-1
// if 3 is target
// target>mid
// l =mid+1;

public class BS
{
    public static void main (String[] args)
    {
        int [] a ={1,2,3};
        System.out.println(bs(a,1));
    }
    public static int bs(int[]nums,int target)
    {
        int l =0;
        int h = nums.length-1;
        while(l<=h)
        {
            int mid = (l+h)/2;
            if(target==nums[mid])
            {
                return mid;
            }
            if(target>nums[mid])
            {
                l = mid +1;
            }
            else
            {
                h = mid-1;
            }

        }

        return -1;
    }
}
