class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==0)
            return 0;
        if(nums.length==1)
            return 1;
        int max=1;
        int j=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]-nums[i-1]==1)
                j++;
            else if(nums[i]-nums[i-1]==0)
                continue;
            else
            {
                max=Math.max(j,max);
                j=1;
            }
        }
        
        return Math.max(max,j);
    }
}
