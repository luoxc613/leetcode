public class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result=new StringBuilder();
        int carry=0;
        int max=Math.max(a.length(),b.length());
        for(int i=0;i<max;i++)
        {
            int anum=0;
            int bnum=0;
            if (i<a.length())
                anum=a.charAt(a.length()-1-i)-'0';
            if(i<b.length())
                bnum=b.charAt(b.length()-1-i)-'0';
            result.append((anum+bnum+carry)%2);
            carry=(anum+bnum+carry)/2;
                
        }
        if(carry>0)
            result.append(carry);
        return result.reverse().toString();
    }
}
