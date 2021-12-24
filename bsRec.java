public static int search(int[] a, int target, int l , int h) {
        if(h>=1)
        {
            int mid = (l+h)/2;
            if(target==a[mid])
                return mid;
            else
            {
                if(target>a[mid])
                    return search(a,target,mid+1,h);
                if(target<a[mid])
                    return search(a,target,l,mid-1);
            }
        }
        return -1;


    }
