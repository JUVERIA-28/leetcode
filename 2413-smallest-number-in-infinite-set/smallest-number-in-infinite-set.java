class SmallestInfiniteSet {
    public int cur;
    public PriorityQueue<Integer> min;
    public Set<Integer> add;
    public SmallestInfiniteSet() 
    {
     cur=1;
     min=new PriorityQueue<>();
     add=new HashSet<>();   
    }
    
    public int popSmallest()
    {
        if(!min.isEmpty())
        {
            int sml=min.poll();
            add.remove(sml);
            return sml;
        }    
        return cur++;
    }
    
    public void addBack(int num) 
    {
        if(num<cur && !add.contains(num))
        {
            min.offer(num);
            add.add(num);
        }    
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */