import java.util.Scanner;

class myException extends Exception
{
   
    myException(String msg)
    {
        super(msg);        
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
            if(this.balance<amt)
            {
                myException e=new myException("NOT ENOUGH BALANCE!!");
                throw e;                                
            }
            else
            {
                this.balance-=amt;
                System.out.println(amt+" has been debited , Remaining amount is : "+this.balance); 
            }
            
        }
        catch(myException e)
        {
            System.out.println("ERROR IN WITHDRAW : "+e.getMessage());
        }
         
    }
} 

class credit extends Thread
{
    Utils obj;
    int amt;
    credit(Utils u,int amt )
    {
        this.obj=u;
        this.amt=amt;
    }
    public void run()
    {        
        obj.credit(amt);
    }
}
class debit extends Thread
{
    Utils obj;
    int amt;
    debit(Utils u,int amt)
    {
        this.amt=amt;
        this.obj=u;
    }
    public void run()
    {          
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

        Utils obj=new Utils(1000);

        int amt;
        System.out.println("Enter amount to credit : ");
        amt=sc.nextInt();
        sc.nextLine();
        credit t1=new credit(obj,amt);
        System.out.println("Enter amount to withdraw : ");
        amt=sc.nextInt();
        sc.nextLine();
        debit t2=new debit(obj,amt);

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