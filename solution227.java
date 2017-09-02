class Solution {
    public int calculate(String s) {
        Stack <Integer> num= new Stack<>();
        Stack <Character> op=new Stack<>();
        int n=s.length();
        if(n==0)
            return 0;
        int r=0;
        char sign='+';
        for(int i=0;i<n;i++)
        {
           
                if(s.charAt(i)<='9'&& s.charAt(i)>='0')
                   {
                    r=r*10+(s.charAt(i)-'0'); 
                }
            if(((s.charAt(i)>'9'||s.charAt(i)<'0')&&s.charAt(i)!=' ' )||i==n-1)
            {
                if(sign=='+')
                    num.push(r);
                else
                    if(sign=='-')
                        num.push(-r);
                else
                    if(sign=='*')
                        num.push(num.pop()*r);
                else
                    if(sign=='/')
                        num.push(num.pop()/r);
                r=0;
                sign=s.charAt(i);
            }
        }
        
        int res=0;
        while(!num.isEmpty())
        {
            res+=num.pop();
        }
        return res;
    }
}
