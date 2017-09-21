class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int sum=1 ,a=1,t=-1;
        for(int i=0;i<n;i++){
            if(nums[i]==0&&a==1)
            {
                a=0;
                t=i;
                continue;
            }
            else 
                if(nums[i]==0&&a==0)
                  a=-1;
             else
                sum*=nums[i];
        }
      if(a==-1) 
        {
            Arrays.fill(nums,0);
            return nums;
        }
        if(a==0)
       {
           Arrays.fill(nums,0);
           nums[t]=sum;
            return nums;
       }
        for(int i=0;i<n;i++)
                nums[i]=sum/nums[i];
            
        return nums;
    }       
}
