public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List <List<Integer>> res= new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++)
        {
            if(i>0 && nums[i]==nums[i-1])
                continue;
            int j=i+1;
            int e=nums.length-1;
            int t=-nums[i];
            while(j<e)
                {
                    if(nums[j]+nums[e]==t)
                    { 
                        res.add(Arrays.asList(nums[i],nums[j],nums[e]));
                        j++;
                        e--;
                        while(j<e && nums[e]==nums[e+1]) e--;
                        while(j<e && nums[j]==nums[j-1]) j++;
                    }
                    else if(nums[j]+nums[e]>t)
                        e--;
                        else 
                            j++;
                }
        }
        return res;
        
    }
}