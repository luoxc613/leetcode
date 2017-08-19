public class Solution {
    public String reverseVowels(String s) {
        if(s.length()<=1)
            return s;
        int [] a= arrayVowel(s);
        int n=0;
        for(int i=0;i<s.length();i++)
            if(a[i]!=-1)
                n++;
            else
                break;
        if(n<=1)
            return s;
        char[] s1=s.toCharArray();
        for(int i=0,j=n-1;i<j;i++,j--)
        {
            char c=s1[a[i]];
            s1[a[i]]=s1[a[j]];
            s1[a[j]]=c;
        }
       s=new String(s1);
        return s;
    }
    public int[] arrayVowel(String s)
    {
        int [] a=new int [s.length()];
        Arrays.fill(a,-1);
        int j=0;
        for(int i=0;i<s.length();i++)
            if(isVowel(s.charAt(i)))
                a[j++]=i;
        return a;
    }
    public boolean isVowel(char c)
    {
        if(c=='a'|| c=='i'||c=='o'||c=='u'||c=='e'||c=='A'||c=='I'||c=='O'||c=='U'||c=='E')
            return true;
        else
            return false;
    }
}
