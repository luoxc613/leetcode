class Solution {
    public int countDigitOne(int n) {
        if(n<=0)return 0;
        int q=n,x=1,ans=0;
        while(q>0){
            int digit=q%10;
            q/=10;
            ans=ans+q*x;
            if(digit==1) ans=n%x+1+ans;
            if(digit>1)ans=ans+x;
            x*=10;
        }
        return ans;
    }
}
