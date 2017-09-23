class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int n=nums.length;
        if(n<=1)
            return n;
        int[] dp=new int [n];
        dp[0]=1;
        for(int i=1;i<n;i++)
        {
            if(nums[i]>nums[i-1])
                dp[i]=dp[i-1]+1;
            else
                dp[i]=1;
        }
        Arrays.sort(dp);
        return dp[n-1];
    }
}
