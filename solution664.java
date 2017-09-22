class Solution {
    public int strangePrinter(String s) {
        int n=s.length();
        int [][] dp=new int [n][n];
        for(int i=n-1;i>=0;i--)
            for(int j=i;j<n;j++)
            {
                if(i==j)
                    dp[i][j]=1;
                else
                    dp[i][j]=dp[i+1][j]+1;
                for(int k=i+1;k<=j;k++)
                    if(s.charAt(k)==s.charAt(i)) dp[i][j]=Math.min(dp[i][j],dp[i+1][k-1]+dp[k][j]);
            }
        if(n==0)
            return 0;
        else
            return dp[0][n-1];
    }
}
