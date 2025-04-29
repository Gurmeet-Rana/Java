/* Write  a  java  program  for  to  solve  producer  consumer 
problem  in  which  a  producer  produce  a  value  and 
consumer consume the value before producer generate 
the next value. */

import java.util.*;

class PC
{
    public int capacity=2;
    public LinkedList<Integer> list=new LinkedList<>();
    public void producer() throws Exception
    {
        
        int value=0;
       
        while(true)
        {
            synchronized(this)
            {
                while(list.size()==capacity)
                {
                    wait();
                }
                System.out.println("Producer is producing value = "+value);
                list.add(value++);
                Thread.sleep(500);
                notify();
            }
        }   
    }
    public void consumer() throws Exception
    {
        while (true) {
           synchronized(this)
           {
                while(list.size()==0)
                {
                    wait();
                }
                System.out.println("Consumer is consuming value = "+list.removeFirst());
                Thread.sleep(500);
                notify();
           }
        }
    }
}

class A extends Thread
{
    PC p;
    A(PC obj)
    {
        this.p=obj;
    }
    public void run()
    {
        try
        {
            p.producer();
        }
        catch(Exception e)
        {
            System.out.println("ERROR IN PRODUCER : "+e.getMessage());
        }
    }
}

class B extends Thread
{
    PC p;
    B(PC obj)
    {
        this.p=obj;
    }
    public void run()
    {
        try
        {
            p.consumer();
        }
        catch(Exception e)
        {
            System.out.println("ERROR IN CONSUMER : "+e.getMessage());
        }
    }
}

public class producerConsumer
{
    public static void main(String []args)
    {
        PC p=new PC();
        A t1=new A(p);
        B t2=new B(p);
        t1.setName("PRODUCER THREAD ");
        t2.setName("CONSUMER THREAD ");
        t1.start();
        t2.start(); 

        try
        {
            t1.join();
        }
        catch(Exception e)
        {
            System.out.println("ERROR "+e.getMessage());
        }
        try
        {
            t2.join();
        }
        catch(Exception e)
        {
            System.out.println("ERROR "+e.getMessage());
        }


        System.out.println("REST OF THE CODE....");
    }
}