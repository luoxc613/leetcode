class Solution {
    public int[] constructArray(int n, int k) {
        int [] res= new int [n];
        int b=0;
        int i,a;
        for(i=1,a=k+1;a>=i;)
        {
            if(b%2==0)
            {
                res[b++]=i++;
            }
            else
            {
                res[b++]=a--;
            }
        }
       for(i=k+2;i<=n;i++)
           res[b++]=i;
        return res;
    }
}
