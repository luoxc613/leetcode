public class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        if(nums[0]!=0|| nums.length==0)
          return 0;
        int i;
      for( i=1;i<nums.length;i++)
      {
          if(nums[i]-nums[i-1]>1)
              return nums[i]-1;
      }
        return nums[i-1]+1;
    }
}
