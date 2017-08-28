class Solution {
    public String countAndSay(int n) {
        String res=new String();
        res="";
        if(n==0)
            return res.toString();
        if(n==1)
        {
           res=res+1;
            return res;
        }
        res=res+1;
        while(n>1)
        {
            String t=new String(res);
            res="";
            int count=0;
            for(int i=0;i<t.length();i++)
            {
                count++;
                if(i+1<t.length()&&t.charAt(i)==t.charAt(i+1))
                    continue;
                else
                {
                    res=res+count+t.charAt(i);
                    count=0;
                }
            }
            n--;
        }
        return res;
    }
}
