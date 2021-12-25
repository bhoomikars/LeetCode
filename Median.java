public class Median
{
    public static void main (String[] args)
    {
        int[] nums1 = { 1, 2 };
        int[] nums2 = { 3, 4 };
        int[] res = findMedianSortedArrays(nums1, nums2);

        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
        System.out.println(median(res));
    }

    public static int[] findMedianSortedArrays (int[] nums1, int[] nums2)
    {
        int[] res = new int[nums1.length + nums2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        int n1 = nums1.length;
        int n2 = nums2.length;
        while (i < n1 && j < n2) {
            if (nums1[i] < nums2[j]) {
                res[k++] = nums1[i++];
            }
            else {
                res[k++] = nums2[j++];
            }
        }
        while (i < n1) {
            res[k++] = nums1[i++];
        }
        while (j < n2) {
            res[k++] = nums2[j++];
        }
        return res;
    }

    public static double median (int[] res)
    {
        //1234 4/2 = 2
        int p = 0;
        int q = 0;
        int m = 0;
        double result = 0.0;
        int n = res.length;
        if (n % 2 == 0) {
            p = n / 2;
            q = p - 1;
            result = (res[p] + res[q]) / 2.0;

            return result;
        }
        else {
            m = n / 2;
            result = res[m];
            return result;

        }

    }

}
