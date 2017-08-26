class Solution {
    public int islandPerimeter(int[][] grid) {
        if(grid.length==0||grid[0].length==0)
            return 0;
        int l=0;
        int c=0;
        for(int i=0;i<grid.length;i++)
            for(int j=0;j<grid[i].length;j++)
            {
                if(grid[i][j]==1)
                {
                    l++;
                    if(j<grid[i].length-1&&grid[i][j+1]==1)
                        c++;
                    if(i<grid.length-1&&grid[i+1][j]==1)
                        c++;
                }
            }
        return l*4-c*2;
    }
    
}
