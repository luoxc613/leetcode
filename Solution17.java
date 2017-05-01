public class Solution17 {
    private static final String[] KEYS={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
       
        List <String> ret= new LinkedList<String>();
         if(digits.length()<1)
            return ret;
        combination("",digits,0,ret);
        return ret;
    }
    
    public void combination(String pre, String digits,int off, List <String> ret )
    {
        if(off>=digits.length())
            {
                ret.add(pre);
                return;
            }
        String letters= KEYS[(digits.charAt(off)-'0')];
        for(int i=0;i<letters.length();i++)
            combination(pre+letters.charAt(i),digits,off+1,ret);
    }
}