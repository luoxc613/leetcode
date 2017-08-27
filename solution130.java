class Solution {
    public void solve(char[][] board) {
        int n=board.length;
        if(n==0)
            return;
        int m=board[0].length;
        if(m==0)
            return;
        int [][]visit=new int[n][m];
       for(int j=0;j<m;j++)
       {
           if(visit[0][j]==0&&board[0][j]=='O');
            dfs(board,visit,0,j);
       }
        for(int i=0;i<n;i++)
        {
           if(visit[i][0]==0&&board[i][0]=='O');
            dfs(board,visit,i,0);
       }
        for(int j=0;j<m;j++)
        {
           if(visit[n-1][j]==0&&board[n-1][j]=='O');
            dfs(board,visit,n-1,j);
       }
        for(int i=0;i<n;i++)
            {
           if(visit[i][m-1]==0&&board[i][m-1]=='O');
            dfs(board,visit,i,m-1);
       }
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
            {
                if(board[i][j]=='Z')
                {
                    board[i][j]='O';
                    continue;
                }
                if(board[i][j]=='O')
                {
                    board[i][j]='X';
                }
                
            }
        return;
    }
    public void dfs(char [][] board,int [][] visit,int n,int m)
    {
        
        if(n<0||m<0||n>=board.length||m>=board[0].length||board[n][m]!='O'||visit[n][m]==1)
            return;
        board[n][m]='Z';
        visit[n][m]=1;
        if(n>0&&visit[n-1][m]==0&&board[n-1][m]=='O')
        dfs(board,visit,n-1,m);
        if(m>0&&visit[n][m-1]==0&&board[n][m-1]=='O')
        dfs(board,visit,n,m-1);
        if(m<board[0].length-2&&visit[n][m+1]==0&&board[n][m+1]=='O')
        dfs(board,visit,n,m+1);
        if(n<board.length-2&&visit[n+1][m]==0&&board[n+1][m]=='O')
        dfs(board,visit,n+1,m);
    }
}
