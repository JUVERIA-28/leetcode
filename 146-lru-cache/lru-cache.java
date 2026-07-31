class CDLLNode
{
    int k,val;
    CDLLNode prev=null,next=null;
    CDLLNode(int k,int val)
    {
        this.k=k;
        this.val=val;
        prev=this;
        next=this;
    }
}
class CDLL
{
    CDLLNode head=null;
    int removeLast()
    {
        if(head==null)
            return -1;
        CDLLNode rem=head.prev;
        if(rem==head){
            int ret=rem.k;
            head=null;
            return ret;
        }
        
            int ret=rem.k;
            CDLLNode lastPrev=rem.prev;
            lastPrev.next=head;
            head.prev=lastPrev;
            return ret;
        
    }
    CDLLNode insertBegin(int key,int value)
    {
        CDLLNode newnode=new CDLLNode(key,value);
        if(head==null){
            head=newnode;
        }
        else{
            CDLLNode last=head.prev;
            newnode.next=head;
            newnode.prev=last;

            //head.prev=last;
            last.next=newnode;
            head.prev=newnode;
            head=newnode;
           // head.next=newnode;//4pointerss
        }
        return newnode;
    } //update in Map
        void moveToFront(CDLLNode node)
        {
            if(node==head || head==null)
            {
                return;
            }
            
                node.prev.next=node.next;
                node.next.prev=node.prev;
                CDLLNode last=head.prev;
                node.next=head;
                node.prev=last;
                last.next=node;
                head.prev=node;
                head=node;
            
        }
}
class LRUCache {

    int size;
    int sz;
    Map<Integer,CDLLNode> mp;
    CDLL list;
    public LRUCache(int capacity) 
    {
        this.size=capacity;
        this.sz=0;
        mp=new HashMap<>();
        list=new CDLL();
    }
    
    public int get(int key)
    {
        if(!mp.containsKey(key)){
            return -1;
        }
        CDLLNode node=mp.get(key);
        list.moveToFront(node);
        return node.val;

    }
    
    public void put(int key, int value)
    {
        if(mp.containsKey(key))
        {
            CDLLNode node=mp.get(key);
            node.val=value;
            list.moveToFront(node);
            return;
        }
        if(sz<size)
        {
            CDLLNode nn=list.insertBegin(key,value);
            mp.put(key,nn);
            sz++;
        }
        else
        {
            int rem=list.removeLast();
            mp.remove(rem);
            CDLLNode nn=list.insertBegin(key,value);
            mp.put(key,nn);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */