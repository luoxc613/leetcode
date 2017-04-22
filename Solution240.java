public class Solution240 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null || matrix.length<1 || matrix[0].length<1)
            return false;
        int m=matrix[0].length-1;
        int n=matrix.length-1;
        int i=0;
        while(i<=m && n>=0)
        {
            if(matrix[n][i]==target)
                return true;
            else if(matrix[n][i]>target)
                n--;
            else if(matrix[n][i]<target)
                i++;
        }
        return false;
    }
   
}