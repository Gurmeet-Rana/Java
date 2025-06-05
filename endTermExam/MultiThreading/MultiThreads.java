class T1 extends Thread
{    
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("From "+this.getName()+" i = "+i);
            try{
                this.sleep(500);
            }
            catch(InterruptedException e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
}

class T2 extends Thread
{
    public void run()
    {
        for(int i=0;i<9;i++)
        {
            System.out.println("From "+this.getName()+" i = "+i);
        try{
            this.sleep(500);
        }
        catch(InterruptedException e)
        {
            System.out.println(e.getMessage());
        }
        }
    }
}

public class MultiThreads {
    public static void main(String []args)
    {
        T1 t=new T1();
        T2 t2=new T2();
        t.start();

        try{
            t.join();
        }
        catch(InterruptedException e)
        {
            System.out.println(e.getMessage());
        }

        t2.start();

        try{
            t2.join();
        }
        catch(InterruptedException e)
        {
            System.out.println(e.getMessage());
        }

        System.out.println("EXITING---");
    }
}
