class LRUCache {
   
         private int capacity;
         private Map<Integer,Integer> m=new HashMap<>();
     private List<Integer> s=new ArrayList<>();
    public LRUCache(int capacity) {
        this.capacity=capacity;
    }
    
    public int get(int key) {
        if(!m.containsKey(key))
            return -1;
        
            int value=m.get(key);
            delete(s.iterator(),key);
            s.add(0,key);
            return value;
        
    }
    
    public void put(int key, int value) {
        int size=m.size();
        if(m.containsKey(key))
            {
                m.put(key,value);
                delete(s.iterator(),key);
                s.add(0,key);
                return;
            }
        else
            if(size<this.capacity)
        {
                m.put(key,value);
                s.add(0,key);
                return;
    
        }
        else
        {
            int k=s.get(this.capacity-1);
            delete(s.iterator(),k);
            m.remove(k);
            m.put(key,value);
            s.add(0,key);
        }
        return;
    }
    public void delete(Iterator<Integer> it, int key)
    {
        while(it.hasNext())
        {
            int i=it.next();
            if(i==key)
                it.remove();
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
