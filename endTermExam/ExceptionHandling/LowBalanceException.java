import java.util.*;

public class LowBalanceException extends Exception {
    LowBalanceException(String msg)
    {
        super(msg);
    }
    public static void main(String []args)
    {
        String name;
        int bal,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name : ");
        name=sc.nextLine();
        System.out.println("Enter the balance amount : ");
        bal=sc.nextInt();
        System.out.println("Enter the account number : ");
        n=sc.nextInt();
        
        Bank obj=new Bank(bal, name, n);

        int amt;
        System.out.println("Enter amt to deposit : ");
        amt=sc.nextInt();
        obj.deposit(amt);
        System.out.println("ENter to withdraw : ");
        amt=sc.nextInt();
        obj.withdraw(amt);

        obj.display();

        System.out.println("EXITING THE SBI....");

    }
}

class Bank
{
    int balance;
    String name;
    int n;
    Bank(int bal,String name,int n)
    {
        this.balance=bal;
        this.name=name;
        this.n=n;
    }
    int deposit(int m)
    {
        return this.balance+=m;
    }
    int withdraw(int m)
    {
        try{
            if(this.balance<m)
            {
                throw new LowBalanceException("Not enough money !!");
            }
            this.balance-=m;
        }
        catch(LowBalanceException e)
        {
            System.out.println(e.toString());
        }

        return this.balance;
    }
    void display()
    {
        System.out.println(this.balance);
    }
    
}