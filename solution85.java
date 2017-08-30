class Solution {
    public int maximalRectangle(char[][] matrix) {
        int n=matrix.length;
        if(n==0)
            return 0;
        int m=matrix[0].length;
        if(m==0)
            return 0;
        int [] height=new int [m];
        int max=0;
        for(int i=0;i<n;i++)
        {
            update(matrix,height,i);
            max=Math.max(max,getMax(height));
        }
        return max;
    }
    public void update(char[][]ma, int [] height, int n)
    {
        int m=ma[0].length;
        for(int i=0;i<m;i++)
        {
            if(ma[n][i]=='0')
                height[i]=0;
            else
                height[i]+=1;
        }
        return;
    }
    public int getMax(int [] height)
    {
        if(height == null || height.length == 0) return 0;
    int len = height.length;
    Stack<Integer> s = new Stack<Integer>();
    int maxArea = 0;
    for(int i = 0; i <= len; i++){
        int h = (i == len ? 0 : height[i]);
        if(s.isEmpty() || h >= height[s.peek()]){
            s.push(i);
        }else{
            int tp = s.pop();
            maxArea = Math.max(maxArea, height[tp] * (s.isEmpty() ? i : i - 1 - s.peek()));
            i--;
        }
    }
    return maxArea;
    }
}
