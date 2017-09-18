class Solution {
    public List<List<Integer>> permute(int[] nums) {
       
        List<List<Integer>> res= new ArrayList<>();
        if(nums.length==0)
            return res;
        List<Integer> num=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
            num.add(nums[i]);
        List<Integer> c=new ArrayList<>();
        helper(res,num,c);
        return res;
    }
    public void helper(List<List<Integer>> res,List<Integer> num,List<Integer> c)
    {
        int n=num.size();
        if(n==0)
            return;
        if(n==1)
        {
          
            List<Integer> t= new ArrayList<>(c);
            t.add(num.get(0));
            res.add(t);
            return;
        }
        for(int i=0;i<n;i++)
        {
            int t=num.get(0);
            c.add(t);
            num.remove(0);
            helper(res,num,c);
            
            if(c.size()>0)
                c.remove(c.size()-1);
            
            num.add(t);
        }
        return;
    }
}
