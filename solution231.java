public class Solution {
    public boolean isPowerOfTwo(int n) {
       if(n==0)
           return false;
        if(n==2||n==1)
            return true;
        if(n%2==1)
            return false;
        else
            if(n == ((int)Math.sqrt(n)*(int)Math.sqrt(n)))
                    return isPowerOfTwo((int)Math.sqrt(n));
                else 
                        if(n/2 == ((int)Math.sqrt(n/2)*(int)Math.sqrt(n/2)))
                            return isPowerOfTwo((int)Math.sqrt(n/2));
                        else  
                            return false;
    } 
}
