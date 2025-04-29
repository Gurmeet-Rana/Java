import java.util.Scanner;

class myException extends Exception
{
    String msg;
    myException(String msg)
    {
        super(msg);
        this.msg=msg;
    }
}

class Utils
{
    public int balance;

    Utils(int amt)
    {
        this.balance=amt;
    }
    public synchronized void credit(int amt)
    {
        this.balance+=amt;
    }
    public synchronized void withdraw(int amt)
    {
        try
        {
            if(this.balance>amt)
            {
                myException e=new myException("NOT ENOUGH BALANCE!!");
                throw e;                                
            }
            
        }
        catch(myException e)
        {
            System.out.println("ERROR IN WITHDRAW : "+e.msg);
        }
        finally
        {
            this.balance-=amt;
            System.out.println(amt+" has been debited , Remaining amount is : "+this.balance);  
        }
    }
} 

class credit extends Thread
{
    Utils obj;
    credit(Utils u)
    {
        this.obj=u;
    }
    public void run()
    {
        int amt;
        System.out.println("Enter amount to credit : ");
        Scanner sc=new Scanner(System.in);
        amt=sc.nextInt();        
        obj.credit(amt);
    }
}
class debit extends Thread
{
    Utils obj;
    debit(Utils u)
    {
        this.obj=u;
    }
    public void run()
    {
        int amt;
        System.out.println("Enter amount to withdraw : ");
        Scanner sc=new Scanner(System.in);
        amt=sc.nextInt();   
        obj.withdraw(amt);
    }
}

public class Bank {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int balance;
        System.out.println("Enter the balance : ");
        balance=sc.nextInt();
        sc.nextLine();

        Utils obj=new Utils(balance);

        credit t1=new credit(obj);
        debit t2=new debit(obj);

        t1.start();
        t2.start();
        
        try
        {
            t1.join();
            t2.join();
        }
        catch(InterruptedException e)
        {
            System.out.println(e.getMessage());
        }

        System.out.println("remaining balance : "+obj.balance);


    }
    
}