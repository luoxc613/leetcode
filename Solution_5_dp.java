public class Solution_5_dp {
    public String longestPalindrome(String s) {
           if(s.length()==0)
            return null;
            int max=1;
            int start=0;
            boolean dp[][]=new boolean [s.length()][s.length()];
            for(int i=0;i<s.length();i++)
                {
                    dp[i][i]=true;
                    if(i<s.length()-1 && s.charAt(i)==s.charAt(i+1))
                        {
                            dp[i][i+1]=true;
                            start=i;
                            max=2;
                        }
                }
            for(int strlen=3;strlen<=s.length();strlen++)
                for(int i=0;i<=s.length()-strlen;i++)
                    {
                        int j=strlen+i-1;
                        if(dp[i+1][j-1]&&s.charAt(i)==s.charAt(j))
                            {
                                dp[i][j]=true;
                                if(strlen>max)
                                {max=strlen;
                                start=i;}
                            }
                    }
            
        return s.substring(start,start+max);
        
    }
}