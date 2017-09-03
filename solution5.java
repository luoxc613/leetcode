public class Solution {
    public String longestPalindrome(String s) {
           if(s.length()==0)
            return null;
            int max=1;
            int start=0;
            for(int i=0;i<s.length();i++)
                {
                    int j=i+1;
                    int z=i-1;
                    while(z>=0 &&j<s.length()&&s.charAt(j)==s.charAt(z))
                        {
                            if(max<j-z+1)
                                {
                                    max=j-z+1;
                                    start=z;
                                }
                            j++;
                            z--;
                        }
                }
            for(int i=0;i<s.length();i++)
            {
                int j=i;
                int z=i+1;
                while(j>=0 &&z<s.length()&&s.charAt(j)==s.charAt(z))
                    {
                        if(max<z-j+1)
                        {
                            max=z-j+1;
                            start=j;
                        }
                        j--;
                        z++;
                    }
            }
            
        return s.substring(start,start+max);
        
    }
}
