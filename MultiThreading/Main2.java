class A extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println(this.getName()+ " i= "+i);
            try
            {
                this.sleep(500);

            }
            catch(InterruptedException e)
            {
                System.out.println("ERROR : "+e);
            }
        }
    }
}


public class Main2 {
    public static void main(String []args)
    {
        A t1=new A();
        t1.start();
        try
        {
            t1.join(1600);//AFTER THIS TIME , REST OF THE CODE (MAIN THREAD WILL RESUME AND RUN CONCURRENTLY) WILL BE PRINTED ! 
        }
        catch(InterruptedException e)
        {
            System.out.println("ERROR : "+e);
        }
        System.out.println("Main Thread Resumes . REST OF THE CODE !!!!!! ");
    }
}
