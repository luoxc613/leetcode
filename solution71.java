class Solution {
    public String simplifyPath(String path) {
     Stack <String>s=new Stack<>();
        Set<String> c=new HashSet<>(Arrays.asList("..",".",""));
        for(String d:path.split("/"))
        {
            if(d.equals("..")&& !s.isEmpty()2)s.pop();
            else
                if(!c.contains(d)) s.push(d);
        }
        String res="";
        while(!s.isEmpty()) res="/"+s.pop()+res;
        return res.isEmpty()?"/":res;
    }
}
