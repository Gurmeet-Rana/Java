
import java.util.*;

class CSThread extends Thread
{
    public void run()
    {
        for(int i=0;i<10000;i++)  
        {
            try{
                this.sleep(500);
            }catch(InterruptedException e)
            {
                System.out.println("Exceptions + "+e);
            }
            System.out.println("IN "+this.getName()+" i = "+i);
        }
    }
}
class IThread extends Thread
{
    public void run()
    {
        for(int i=0;i<10000;i++) 
        {
            try{
                this.sleep(500);
            }catch(InterruptedException e)
            {
                System.out.println("Exceptions + "+e);
            }
            
            System.out.println("IN "+this.getName()+" j = "+i);
        }
    }
}

public class q19 {
    public static void main(String []args)
    {
        CSThread t1=new CSThread();
        IThread t2=new IThread();
        t1.start();
        t2.start();
        System.out.println("EXITING...");

    }    
}
