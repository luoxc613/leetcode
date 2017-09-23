class MagicDictionary {
    Map<String, List<int[]>> m= new HashMap<>();
    /** Initialize your data structure here. */
    public MagicDictionary() {
        
    }
    
    /** Build a dictionary through a list of words */
    public void buildDict(String[] dict) {
        for(String s: dict)
        {
            for(int i=0;i<s.length();i++)
            {
                String t=s.substring(0,i)+s.substring(i+1);
                int[] p= new int[]{i,s.charAt(i)};
                List<int []> v= m.getOrDefault(t,new ArrayList<>());
                v.add(p);
                m.put(t,v);
            }
        }
    }
    
    /** Returns if there is any word in the trie that equals to the given word after modifying exactly one character */
    public boolean search(String word) {
        for(int i=0;i<word.length();i++)
        {
            String t=word.substring(0,i)+word.substring(i+1);
            if(m.containsKey(t))
            {
                for(int []p:m.get(t))
                {
                    if(i==p[0]&& word.charAt(i)!=p[1]) return true;
                }
            }
        }
        return false;
    }
}

/**
 * Your MagicDictionary object will be instantiated and called as such:
 * MagicDictionary obj = new MagicDictionary();
 * obj.buildDict(dict);
 * boolean param_2 = obj.search(word);
 */
