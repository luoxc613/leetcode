public class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length==0)
            return 0;
        if(nums.length==1)
            return nums[0];
        Map<Integer,Integer> m= new HashMap<Integer,Integer>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(!m.containsKey(nums[i]))
                m.put(nums[i],1);
            else
                m.put(nums[i],2);
        }
        int i;
        for(i=0;i<n;i++)
        {
            if(m.get(nums[i])==1)
                break;
        }
        return nums[i];
    }
}
