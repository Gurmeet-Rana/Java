import java.util.*;


class Thread1 extends Thread
{
    PC obj;
    Thread1(PC obj)
    {
        this.obj=obj;
    }
    public void run()
    {
       try{
          obj.producer();
       }
       catch(Exception e)
       {
        System.out.println(e.toString());
       }
    }
}

class Thread2 extends Thread
{
    PC obj;
    Thread2(PC obj)
    {
        this.obj=obj;
    }
    public void run()
    {
       try{
         obj.consumer();
       } catch (Exception e) {
        // TODO: handle exception
        System.out.println(e.getMessage());
       }
    }
}

 

public class PC {
    LinkedList<Integer> list=new LinkedList<Integer>();
    int capacity=2;
    public void producer() throws InterruptedException
    {
        int value=0;
        while(true)
        {
            synchronized(this){
                while(list.size()==capacity)
                {
                    wait();
                }
                System.out.println("Producer is gonna produce : "+value);
                list.add(value++);
                notify();

                 }
                Thread.sleep(500);
           
        }
    }
    public void consumer() throws InterruptedException
    {
        while(true)
        {
            synchronized(this){
                while(list.size()==0)
                {
                    wait();
                }
                System.out.println("Consumer is gonna consume : "+list.removeFirst());
                notify();

                 }

                Thread.sleep(500);
           
        }
    }
    
    public static void main(String []args) throws Exception
    {
        PC obj=new PC();
        Thread1 t1=new Thread1(obj);
        Thread2 t2=new Thread2(obj);
        
        t1.start();
        t2.start();

        System.out.println("PROGRAM KHTM---");
    }
}
