/* Create a class MyBank with following details- 
private double balance  
public MyBank(double balance) // constructor 
public void deposit(double amount)// to deposit amount 
public void withdraw (double amount) // to withdraw 
public double getBalance() // to fetch the balance of account 
Create another class MyTransaction, which is a thread class with following details- 
private MyBank account // Data member 
private double amount // Data member 
private boolean flag // Data member, it will be true for deposit and false for withdraw 
public MyTransaction (MyBank account, double amount, boolean flag)// constructor 
Also override the run() method to call deposit() and withdraw() methods. 
Create main thread where- 
Create  an  object  of  Mybank  with  initial  balance  1000  Rs.  Also  create  two  threads  of 
MyTransaction  class  named  as  depositeThread  and  withdrawThread,  both  must  share  the 
same object of Mybank class.  
For deposit thread the flag value must be true and for withdraw thread it must be false. Ex- 
MyTransaction  depositThread=new  MyTransaction(account,500,true);//  500  amount  to  be 
deposited 
MyTransaction withdrawThread=new MyTransaction(account,200,true);// 200 amount to be 
withdrawn 
Write  your  program  in  such  a  way  that,  threads  can  call  deposit  and  withdraw  methods  in 
any order but the final balance of account will be consistent. You must input the deposit and 
withdrawing amount from user.   
Note: Provide the output for at least five different inputs */

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

public class assign3c {
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