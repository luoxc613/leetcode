public class Solution {
    public int getSum(int a, int b) {
        if(a==0)return b;
        if(b==0)return a;
        int c=0;
        c=a&b;
        a=a^b;
        b=c<<1;
        return getSum(a,b);
    }
}
