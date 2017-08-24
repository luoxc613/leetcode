class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Arrays.sort(nums);
        List<Integer> res= new ArrayList<>();
        if(nums.length<=1)
            return res;
        
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==nums[i-1])
                res.add(nums[i]);
        }
        return res;
    }
}
