public class Solution {
    public boolean isPowerOfThree(int n) {
        String a=Integer.toString(n,3);
        if(a.charAt(0)!='1')
            return false;
        for(int i=1     ;i<a.length();i++)
            if(a.charAt(i)!='0')
                return false;
        return true;
    }
}
