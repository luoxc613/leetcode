class Solution {
    public int[] countBits(int num) {
        int [] res=new int[num+1];
        for(int i=0;i<=num;i++)
            res[i]=getBit(i);
        return res;
    }
    public int getBit(int i)
    {
        String s=Integer.toString(i,2);
        int count=0;
        for(int a=0;a<s.length();a++)
        {
            if(s.charAt(a)=='1')
                count++;
        }
        return count;
    }
}
