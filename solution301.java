class Solution {
    public List<String> removeInvalidParentheses(String s) {
        List<String> res= new ArrayList<>();
        if(s==null || s.length()==0) {
            res.add("");
            return res;
        }
        StringBuffer sb=new StringBuffer(s);
        remove(res,sb,0,0,new char[]{'(',')'});
        return res;
    }
    public void remove(List<String> r,StringBuffer s, int start, int pre, char[] m)
    {
        int c=0;
        for(int i=start;i<s.length();i++)
        {
            if(s.charAt(i)==m[0]) c++;
            else if(s.charAt(i)==m[1]) c--;
            if(c<0)
               {
                   for(int j=pre;j<=i;j++)
                   {
                       if((s.charAt(j)==m[1]&&j==0)||(s.charAt(j)==m[1]&&(s.charAt(j)!=s.charAt(j-1))))
                       {
                           s.deleteCharAt(j);
                           remove(r,s,i,j,m);
                           s.insert(j,m[1]);
                       }
                   }
                return;
               }
        }
        if(m[0]=='(')
        {
            remove(r,s.reverse(),0,0,new char[]{')','('});
            s.reverse();
            return;
        }
        r.add(s.reverse().toString());
        s.reverse();
        return;
    }
}