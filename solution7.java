public class Solution {
    public int reverse(int x) {
        int j=0,z=0,result=0;
        
        while(x!=0)
            {
                j=x%10;
                z=result*10+j;
                if(((z-j)/10)!=result)
                    return 0;
                x=x/10;
                result=z;
            }
        return result;
        
    }
}