class Solution {
    public int hIndex(int[] citations) {
         int max=0;
        int n=citations.length;
        if(n==0)
            return max;
        if(n==1)
        {  if(citations[0]>=1)
                return 1;
          else
            return 0;
        }
        for(int i=1;i<=n;i++)
        {
            if(i<n)
            {if(citations[n-i]>=i &&citations[n-i-1]<=i)
                      max=Math.max(i,max);}
            if(i==n)
                if(citations[0]>=i)
                    max=i;
            
        }
        return max;
 
    }
}
