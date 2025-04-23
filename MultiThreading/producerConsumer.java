/* Write  a  java  program  for  to  solve  producer  consumer 
problem  in  which  a  producer  produce  a  value  and 
consumer consume the value before producer generate 
the next value. */

class ABC extends Thread
{
    public void run()
    {   
    
        for(int value=1;value<=5;value++)
        {
            if(this.getName()=="Producer")
            {
                System.out.println("Producer is producing a value !!");
            }
            else
            {
                System.out.println("Consumer is consuming a value !!");
            }
            System.out.println("Value = "+value);
        }
    }
}
public class producerConsumer {
    public static void main(String args[])
    {
        ABC t1=new ABC();
        ABC t2=new ABC();
        t1.setName("Producer");
        t2.setName("Consumer");

        t1.start();
        try
        {
            t1.join();
        }
        catch(InterruptedException e)
        {
            System.out.println(e.getMessage());
        }

        t2.start();

        try
        {
            t2.join();
        }
        catch(InterruptedException e)
        {
            System.out.println(e.getMessage());
        }

        System.out.println("EXITING THE PROGRAM!!!");
    }
}
