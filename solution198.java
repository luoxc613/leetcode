public class Solution {
    public int rob(int[] nums) {
        int n= nums.length;
        if(n==0)
            return 0;
        if(n==1)
            return nums[0];
        if(n==2)
            return Math.max(nums[0],nums[1]);
        int[] dp= new int [n];
        int[] max=new int[n];
        dp[0]=nums[0];
        dp[1]=nums[1];
        max[0]=nums[0];
        max[1]=Math.max(nums[1],max[0]);
        for(int i=2;i<n;i++)
        {
            dp[i]=max[i-2]+nums[i];
            max[i]=Math.max(dp[i],max[i-1]);
        }
        return max[n-1];
    }
}
