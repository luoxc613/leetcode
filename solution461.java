class Solution {
    public int hammingDistance(int x, int y) {
        int a=x^y;
        int sum=0;
        for(int i=0;i<31;i++)
        {
            if((a&1)==1) sum++;
            a>>=1;
        }
        return sum;
    }
}
