public class Solution152 {
    public int maxProduct(int[] nums) {
        if(nums==null || nums.length==0)
            return 0;
        int max=nums[0],min=nums[0],result=nums[0];
        for(int i=1; i<nums.length;i++)
            {
                int temp= max;
                max=Math.max(Math.max(max*nums[i],min*nums[i]),nums[i]);//当包括当前节点时的最大 最小值，方便之后的子串计算
                min=Math.min(Math.min(min*nums[i],temp*nums[i]),nums[i]);
                if(result<max)
                    result=max;
            }
    return result;
    }
}