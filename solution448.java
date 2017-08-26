class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        List<Integer> res= new ArrayList<>();
        Set<Integer> s=new TreeSet<>();
        if(nums.length==0)
            return res;
        for(int i=0;i<nums.length;i++)
                s.add(nums[i]);
        for(int i=1;i<=nums.length;i++)
                if(!s.contains(i))
                    res.add(i);
        return res;
    }
}
