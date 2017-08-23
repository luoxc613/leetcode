public class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()==0 || s.length()==1)
            return true;
        s=s.toLowerCase();
        int n=s.length();
        StringBuilder str= new StringBuilder ();
        for(int i=0;i<n;i++)
        {
            if((s.charAt(i)>='a'&&s.charAt(i)<='z') || (s.charAt(i)<='9'&&s.charAt(i)>='0'))
                str.append(s.charAt(i));
        }
        n=str.length();
        for(int i=0;i<n/2;i++)
        {
            if(str.charAt(i)!=str.charAt(n-i-1))
                return false;
        }
        return true;
    }
}
