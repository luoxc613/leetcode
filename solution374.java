public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int s=1,e=n;
        while(s<e)
        {
            int m=s+(e-s)/2;
            if(guess(m)==0)
                return m;
            else
                if(guess(m)==-1)
                    e=m-1;
            else
                s=m+1;
        }
        return s;
    }
}
