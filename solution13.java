public class Solution {
    public int romanToInt(String s) {
        int res= toint(s.charAt(0));
        for(int i=1;i<s.length();i++)
        {
            if(toint(s.charAt(i))>toint(s.charAt(i-1)))
             res+= toint(s.charAt(i))-2*toint(s.charAt(i-1));
             else
              res+=toint(s.charAt(i));
        }
        return res;
    }
    int toint(char n)
    {
        switch(n){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return 0;
    }
}
