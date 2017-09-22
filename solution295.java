class MedianFinder {
    PriorityQueue<Integer> max=new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer> min=new PriorityQueue<>();
    /** initialize your data structure here. */
    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
      max.offer(num);
      min.offer(max.poll());
      if(max.size()<min.size())
          max.add(min.poll());
    }
    
    public double findMedian() {
        if(max.size()==min.size())
            return(double)(max.peek()+min.peek())/2;
        else
            return (double)(max.peek());
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
