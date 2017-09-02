class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        if(n==0)
            return 0;
        int [] dp=new int [n];
        dp[0]=nums[0];
        for(int i=1;i<n;i++)
        {
            dp[i]=Math.max(nums[i]+dp[i-1],nums[i]);
        }
        Arrays.sort(dp);
        return dp[n-1];
    }
}
