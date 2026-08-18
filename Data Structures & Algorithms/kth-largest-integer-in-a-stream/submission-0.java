class KthLargest {
     PriorityQueue<Integer> min;
    int k;

    public KthLargest(int k, int[] nums) {
         this.k=k;
        min=new PriorityQueue<>();
        for(int num:nums){
            min.add(num);
            if(min.size()>k){
                min.poll();
            }
        }
        
    }
    
    public int add(int val) {
          min.add(val);
        if(min.size()>k){
            min.poll();
        }
        return min.peek();
        
        
    }
}
