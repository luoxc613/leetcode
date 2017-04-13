public class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map= new HashMap<> ();
        int max=0;
        int from=0;
        for(int i=0;i<s.length();i++)
        {
            if(map.containsKey(s.charAt(i)))
            {
                from=Math.max(map.get(s.charAt(i))+1,from);
                map.remove(s.charAt(i));
            }
            map.put(s.charAt(i),i);
            max=Math.max(max,i-from+1);
        }
        return max;
    }
}
