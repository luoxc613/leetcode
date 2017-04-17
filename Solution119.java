public class Solution119 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result=new ArrayList<Integer> ();
        
        for(int i=0;i<=rowIndex;i++)
            {
                List<Integer> temp= new ArrayList<Integer>();
                for(int j=0;j<=i;j++)
                    {
                       
                        if(j==0||j==i)
                            {
                                temp.add(j,1);
                            }
                        else
                        {
                            temp.add(j,(result.get(j-1)+result.get(j)));
                        }
                    }
                result=temp;
                
            }
            return result;
    }
}