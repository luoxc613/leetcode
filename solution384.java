class Solution {
    private int [] nums;
    private Random r;
    public Solution(int[] nums) {
        this.nums=nums;
        r= new Random();
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return nums;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        if(nums==null) return nums;
        int []c=nums.clone();
        for(int i=0;i<nums.length;i++)
        {
            int j=r.nextInt(i+1);
            swap(c,i,j);
        }
        return c;
    }
    public void swap(int []c,int i,int j)
    {
        int t=c[i];
        c[i]=c[j];
        c[j]=t;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */
