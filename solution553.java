class Solution {
    public String optimalDivision(int[] nums) {
        int n=nums.length;
        StringBuilder res= new StringBuilder();
        res.append(nums[0]);
        for(int i=1;i<n;i++)
        {
            if(i==1&& n>2)
                res.append("/(").append(nums[i]);
            else
                res.append("/").append(nums[i]);
        }
        if(n>2)
            res.append(')');
        return res.toString();
    }
}
