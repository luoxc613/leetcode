class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer,Integer> m= new HashMap<>();
        m.put(0,-1);
        for(int i=0;i<nums.length;i++)
            if(nums[i]==0)
                nums[i]=-1;
        int sum=0,max=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            if(m.containsKey(sum))
            {
                max=Math.max(max,i-m.get(sum));
            }
            else
                m.put(sum,i);
        }
        return max;
    }
}
