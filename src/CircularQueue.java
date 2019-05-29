public class CircularQueue {
    private String[] items;
    private int n=0;
    private  int head=0;
    private int tail=0;
    public CircularQueue(int capacity)
    {
        items=new String[capacity];
        n=capacity;
    }

    public boolean enqueue(String item)
    {
        if((tail+1)%n==head) return false;
        items[tail]=item;
        tail=(tail+1)%n;
        return true;
    }
    public String dequeue()
    {
        if(head==tail) return null;
        String ret=items[head];
        head=(head+1)%n;
        return ret;

    }
    public static void main()
    {
        int a=1;
        int ret=0;
        int res=0;
        CircularQueue s=new CircularQueu(0);
        s.add(3,5);


    }
  public int add(int x,int y)
    {
        int sum=0;
        sum=x+y;
        return sum;
    }
}

