class WordDictionary {

    /** Initialize your data structure here. */
    public class TrieNode() {
        public TrieNode[] children=new TrieNode[26];
        public String item="";
    }
      private TrieNode root= new TrieNode();
    
    /** Adds a word into the data structure. */
    public void addWord(String word) {
        TrieNode t=root;
        for(int i=0;i<word.length();i++)
        {
            if(t.children[word.charAt(i)-'a']==null)
                t.children[word.charAt(i)-'a']=new TrieNode();
            t=t.children[word.charAt(i)-'a'];
        }
        node.item=word;
    }
    
    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) {
        return match(word.toCharArray(),0,root);
    }
    public boolean match(char[] word, int k, TrieNode root)
    {
        if(k==word.length()) return true;
        if(word[k]!='.')
            return root.children[word[k]-'a']!=null && match(word,k+1,root.children[word[k]-'a']);
        else
        {
            for(int i=0;i<root.children.length;i++)
            {
                if(root.children[i]!=null)
                   if match(word,k+1,root.children[i])
                       return true;
            }
            return false;
        }
        return false;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */
