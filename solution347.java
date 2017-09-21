class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        List<Integer> res=new ArrayList<>();
        if(n==1)
           {
            res.add(nums[0]);
            return res;
        }
        int [] count= new int [n];
        Arrays.fill(count,1);
        Map <Integer,Integer> m= new HashMap<>();
        int a=0;
        int i=0;
        for(;i<n-1;i++)
        {
            if(nums[i]==nums[i+1])
                count[a]++;
            else
            {
                m.put(nums[i],count[a]);
                a++;
            }
        }
    
            m.put(nums[i],count[a]);
    
        Arrays.sort(count);
       
        for( i=0;i<k;i++)
        {
            for( int j=0;j<n;j++)
            {if(m.containsKey(nums[j]))
                if(m.get(nums[j])==count[n-i-1])
                {
                    res.add(nums[j]);
                    m.remove(nums[j]);
                    break;
                }
            }
        
        }
        return res;
    }
}
