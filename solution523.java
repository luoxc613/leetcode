class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n=nums.length;
        if(n<=1)
            return false;
        int [] pre= new int [n+1];
        for(int i=1;i<=n;i++)
            pre[i]=pre[i-1]+nums[i-1];
        for(int i=0;i<n;i++)
            for(int j=i+2;j<=n;j++)
            {
                if(k==0&&(pre[j]-pre[i])==0)
                    return true;
                else
                    if(k!=0&&(pre[j]-pre[i])%k==0)
                    {
                        return true;
                    }
                    
            }
        return false;
    }
}
