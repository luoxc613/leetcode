public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List <Integer> result= new ArrayList<Integer> ();
        int i1=0;
        int i2=0;
        for(;i1<nums1.length&&i2<nums2.length;)
        {
            if(nums1[i1]<nums2[i2])
                result.add(nums1[i1++]);
            else
                result.add(nums2[i2++]);
        }
        if(i1<nums1.length)
            for(;i1<nums1.length;i1++)
                result.add(nums1[i1]);
        else if(i2<nums2.length)
            for(;i2<nums2.length;i2++)
                result.add(nums2[i2]);
        int t=result.size();
    
        if(t%2==1)
            return (double)result.get(t/2);
        else
            return (double)(result.get(t/2-1)+result.get(t/2))/2;
    }
}
