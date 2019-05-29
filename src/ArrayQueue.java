public class ArrayQueue {
    private  String[] items;
    private int n=0;
    private int head=0;
    private int tail=0;

    public ArrayQueue(int capacity)
    {
        items=new String[capacity];
        n=capacity;
    }
    public boolean enqueue(String item)
    {
       if (tail==n)
       {
           if(head==0) return false;
           for(int i=head;i<tail;++i)
           {
               items[i-head]=items[i];
           }
           tail-=head;
           head=0;
       }
       items[tail]=item;
       ++tail;
       return true;
    }
    public String dequeue()
    {
        if(head==tail) return null;
        tail--;
        return items[head];

    }
}
