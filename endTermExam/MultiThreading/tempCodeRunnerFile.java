import java.util.*;

public class PC {
    LinkedList<Integer> list=new LinkedList<Integer>();
    int capacity=2;
    public void producer() throws Exception
    {
        int value=0;
        while(true)
        {
            synchronized{
                while(list.size()==capacity)
                {
                    wait();
                }
                System.out.println("Producer is gonna produce : "+value);
                list.add(value++);
                notify();

                Thread.sleep(500);
            }
        }
    }
    public void consumer()
    {
        while(true)
        {
            synchronized{
                while(list.size()==0)
                {
                    wait();
                }
                System.out.println("Consumer is gonna consume : "+list.removeFirst());
                notify();

                Thread.sleep(500);
            }
        }
    }
    
    public static void main(String []args)
    {
        PC obj=new PC();
        Thread1 t1=new Thread1(obj);
        Thread2 t2=new Thread2(obj);
        t1.start();
        t2.start();

        System.out.println("PROGRAM KHTM---");
    }
}

class Thread1
{
    PC obj;
    Thread1(PC obj)
    {
        this.obj=obj;
    }
    public void run()
    {
        obj.producer();
    }
}

class Thread2
{
    PC obj;
    Thread2(PC obj)
    {
        this.obj=obj;
    }
    public void run()
    {
        obj.consumer();
    }
}

 