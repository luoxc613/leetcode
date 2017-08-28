class Solution {
    
    public int findTargetSumWays(int[] nums, int S) {
        int count=0;
       count= tryTarget(nums,S,0,0);
        return count;
    }
    public int tryTarget(int [] nums, int sum, int count,int n)
    {
        if(n==nums.length-1)
        {
            if(sum==nums[n])
                count++;
            if(sum==(-nums[n]))
                count++;
            return count;
        }
        
        count=tryTarget(nums,sum+nums[n],count,n+1);

        count=tryTarget(nums,sum-nums[n],count,n+1);
        return count;
    }
}
