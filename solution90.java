class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums); 
        int n=nums.length;
     List<List<Integer>> res=new ArrayList<>();
     if(n==0)
         return res;
        for(int i=0;i<n;i++)
            putNum(res,nums[i]);
        List<Integer> r=new ArrayList<>();
        res.add(r);
        return res;
    }
     public void putNum(List<List<Integer>> res,int a)
    {
        int s=res.size();
        
        for(int i=0;i<s;i++)
        {
            List<Integer> t=new ArrayList<>(res.get(i));
            
            t.add(a);
            if(res.contains(t))
                continue;
            res.add(t);
        }
        List<Integer> r=new ArrayList<>();
        r.add(a);
         if(res.contains(r))
             return;
        res.add(r);
        return;
    }
}
