import java.util.*;
public class PC
{
    LinkedList<Integer> list=new LinkedList<>();
    int capacity=2;
    int value=0;
    class Producer extends Thread
    {
        public void run()
        {
            try{
                while(true)
                {
                    synchronized(list)
                    {
                        while(list.size()==capacity)
                        {
                            list.wait();
                        }
                        System.out.println("Producer is producing value : "+value);
                        list.add(value++);
                        list.notify();
                    }
                    Thread.sleep(500);
                }
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
    class Consumer extends Thread
    {
        public void run()
        {
            try{
            while(true)
            {
                synchronized(list)
                {
                    while(list.isEmpty())
                    {
                        list.wait();
                    }
                    System.out.println("Consumer is consuming the value : "+list.removeFirst());
                    list.notify();
                }
                Thread.sleep(500);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        }
    }
    public static void main(String []args)
    {
        PC obj=new PC();
        Producer p=obj.new Producer();
        Consumer c=obj.new Consumer();
        p.start();
        c.start();
        System.out.println("EXITING THE MAIN PROGRAM---");
    }
} 