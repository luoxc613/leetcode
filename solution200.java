class Solution {
    public int numIslands(char[][] grid) {
        if(grid.length==0)
            return 0;
        int n=grid.length;
        int m=grid[0].length;
        int c=0;
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]=='1')
                {
                   turnZero(grid,i,j);
                    c++;
                }
            }
        return c;
    }
    public void turnZero(char [][] grid,int i, int j)
    {
         int n=grid.length;
        int m=grid[0].length;
        if(i<0|| j<0||i>=n || j>=m||grid[i][j]=='0') return;
        grid[i][j]='0';
        turnZero(grid,i-1,j);
        turnZero(grid,i+1,j);
        turnZero(grid,i,j+1);
        turnZero(grid,i,j-1);
    }
}
