class Solution {
    public int[] singleNumber(int[] nums) {
        if(nums.length==2)
            return nums;
        int [] res=new int [2];
        int a=0;
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(m.containsKey(nums[i]))
                m.put(nums[i],2);
            else
                m.put(nums[i],1);
        }
        for(int i=0;i<nums.length;i++)
            if(m.get(nums[i])==1)
                res[a++]=nums[i];
        return res;
    }
}
