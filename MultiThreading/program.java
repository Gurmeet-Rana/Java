class Temp
{    
    public synchronized void pTable(int x)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(x+" * "+i+" = "+x*i);
        }
    }
    public synchronized void Psum(int x)
    {
        int sum=0;
        for(int i=1;i<=10;i++)
        {
            System.out.println(x+" + "+i+" = "+(x+i));
        }
    }
}

class A extends Thread
{
    int x;
    Temp t;
    A(Temp t,int x)
    {
        this.x=x;
        this.t=t;
    }
    
    public void run()
    {
        System.out.println(" THREAD NAME : "+this.currentThread().getName());
        t.pTable(x);
        t.Psum(x);
    }
}

public class program {
    public static void main(String []args)
    {
        Temp t =new Temp();
        A t1=new A(t,10);
        A t2=new A(t,10);

        t1.start();
        

        try
        {
            t1.join();
        }
        catch(InterruptedException e)
        {
            System.out.println("ERROR : "+e);
        }

        t2.start();
        
        try
        {
            t2.join();
        }
        catch(InterruptedException e)
        {
            System.out.println("ERROR : "+e);
        }

        System.out.println("REST OF THE CODE !! ");
    }
}
