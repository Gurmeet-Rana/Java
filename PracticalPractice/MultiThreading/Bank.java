import java.util.*;

class Resource
{
    int amt;
    Resource(int amt)
    {
        this.amt=amt;
    }
    void credit(int amt)
    {
        this.amt+=amt;
    }
    void withdraw(int amt)
    {
        this.amt-=amt;
    }
    void checkBalance()
    {
        System.out.println("Balance Amount : "+this.amt);
    }
}
class Producer extends Thread
{
    Resource obj;
    int amt;
    Producer(Resource r,int amt)
    {
        this.obj=r;
        this.amt=amt;
    }
    public void run()
    {
        synchronized(obj)
        {
             obj.credit(amt);
        obj.checkBalance();
        }
       
    }
}
class Consumer extends Thread
{
    Resource obj;
    int amt;
    Consumer(Resource r,int amt)
    {
        this.obj=r;
        this.amt=amt;        
    }
    public  void run()
    {
        synchronized(obj)
        {
            obj.withdraw(amt);
        obj.checkBalance();
        }
        
    }
}


public class Bank {
    public static void main(String []args)
    {
        Resource r=new Resource(1000);
        Producer t1=new Producer(r, 10);
        Consumer t2=new Consumer(r, 40);

        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }catch(InterruptedException e)
        {
            System.out.println(e);
        }

        r.checkBalance();
        System.out.println(" EXITING---");

    }
}
