class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n=gas.length;
        int m=cost.length;
        for(int j=0;j<n;j++)
        {
            int a=0;
            int left=0;
            int i=j;
            while(a<n)
            {
                if(i==n)
                    i=0;
                left+=gas[i];
                left-=cost[i];
                if(left<0)
                    break;
                else
                    {a++;
                     i++;}
            }
            if(a==n)
                return j;
        }
        return -1;
    }
}
