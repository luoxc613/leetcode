class Solution {
    public int nextGreaterElement(int n) {
        char [] res=(n + "").toCharArray();
        int a=res.length;
        int i=0;
        for( i=a-1;i>0;i--)
        {
            if(res[i-1]<res[i])
                break;
        }
        if(i==0)
            return -1;
        int min=i-1,small=res[min+1],s=min+1;
        for(int j=min+2;j<a;j++)
        {
           if(res[j]>res[min]&& res[j]<=small)
            s=j;
        }
        char t=res[min];
        res[min]=res[s];
        res[s]=t;
        Arrays.sort(res,min+1,a);
        long val=Long.parseLong(new String(res));
        return val<=Integer.MAX_VALUE? (int) val:-1;
    }
}
