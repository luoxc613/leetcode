class Solution {
    public int minSteps(int n) {
        int [] dp=new int [n+1];
        if(n==0)
            return 0;
        dp[1]=0;
        if(n==1)
            return dp[1];
        dp[2]=2;
        for(int i=3;i<=n;i++)
        {
            List<Integer> r= new ArrayList<>();
            r=get(i);
            int b=r.size();
            dp[i]=i;
            for(int a=0;a<b;a++)
            {
                dp[i]=Math.min(dp[i],dp[r.get(a)]+(i/r.get(a)));
            }
        }
        return dp[n];
    }
    public List<Integer> get(int n)
    {
        List<Integer> r= new ArrayList<>();
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                r.add(i);
                r.add(n/i);
            }
        }
        return r;
    }
}
