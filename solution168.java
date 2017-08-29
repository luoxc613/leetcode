class Solution {
    public String convertToTitle(int n) {
        String s="";
        while(n!=0)
        {
            char c=(char)((n-1)%26+65);
            s=c+s;
            n=(n-1)/26;
        }
        return s;
    }
}
