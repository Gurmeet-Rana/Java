import java.util.Scanner;

class myException extends Exception
{
    myException(String s)
    {
        super(s);
    }
}

class Bank
{
    int balance;
    Bank(int amt)
    {
        this.balance=amt;
    }
    void deposit(int amt)
    {
        this.balance+=amt;
        System.out.println("Your account has been deposited creditted with "+amt);.
    }
    void withDrawal(int amt)
    {
        try
        {
            if(amt>balance)
            {
                myException e=new Exception("Your account doesn't have sufficient amount to make this transaction!");
                
            }
        }
    }
}

public class lowBalance {
    
    public static void main(String []args)
    {

    }

}
