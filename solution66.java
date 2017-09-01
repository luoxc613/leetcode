class Solution {
    public int[] plusOne(int[] digits) {
       int c=0;
        int n=digits.length;
        int [] res= new int[n+1];
        if(digits[n-1]+c+1>=10)
        {
         digits[n-1]=digits[n-1]+c+1-10;
         res[n]=digits[n-1];
         c=1;
        }
        else
        {
            digits[n-1]+=1;
            res[n]=digits[n-1];
        }
       for(int i=n-2;i>=0;i--)
       {
           if(digits[i]+c==10)
           {
               digits[i]=0;
               c=1;
           }
           else
           {
               digits[i]+=c;
               c=0;}
           res[i+1]=digits[i];
       }
        if(c==1)
        {   res[0]=1;
        return res;}
        else
            return digits;
    }
}
