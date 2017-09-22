class Solution {
    public void sortColors(int[] nums) {
        int end=nums.length;
        quickSort(nums,0,end-1);
    }
    public void quickSort(int nums[],int s,int e)
    {
        if(s>=e)
            return ;
       
        int p=nums[s];
        int l=s,r=e;
        while(l<r)
        {
            
            while(nums[r]>=p&&l<r)r--;
            while(nums[l]<=p&&l<r)l++;
            if(l<r){int a=nums[l];
            nums[l]=nums[r];
            nums[r]=a;}
        }
        
        nums[s]=nums[l ];
        nums[l ]=p;
        quickSort(nums,s,l-1);
        quickSort(nums,l+1,e);
        return;
    }
}
