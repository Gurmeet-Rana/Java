import java.util.Scanner;

public class temp{
    private String name,address;
    private static int accNumber;
    private float balance;
    static{
        accNumber=1000;
    }

    public temp(){};

    public temp(String name,String address,float bal)
    {
        this.name=name;
        this.address=address;
        this.balance=bal;
    }

    public void display()
    {
        System.out.println("NAME : "+this.name);
        System.out.println("ACCOUNT NUMBER : "+accNumber);
        System.out.println("BALANCE : "+this.balance);
        System.out.println("ADDRESS : "+this.address);
    }

    void deposit(float x)
    {
        this.balance+=x;
    }

    void withdraw(float x)
    {
        try
        {
            if(x<=balance)
            {
                balance-=x;
            }
            else
            {
                throw new Exception();
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

    public void changeAdd(String newAddress)
    {
        this.address=newAddress;
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int choice=0;
        String name,address;
        float balance;

        temp b=new temp();

        while(true)
        {
            System.out.println("1. CREATE CUSTOMER \n 2. VIEW DETAILS \n3 DEPOSIT MONEY \n4 WITHDEAW \n5 EXIT");
            choice=sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("NMAE ; ");
                    name = sc.nextLine();
                     
                    System.out.println("ADDRESS : ");
                    address=sc.nextLine();
                    
                    System.out.println("balance : ");
                    balance=sc.nextFloat();
                    sc.nextLine();
                    b=new temp(name,address,balance);
                    break;
                case 2: 
                    System.out.println(" USER : ");
                    if(b!=null)
                    {
                        b.display();
                    }    
                    else
                    {
                        System.out.println("EMTY");
                    }
                    break;

                case 3:
                    System.out.println("ENTER AMOUTN ");
                    balance=sc.nextFloat();
                    b.deposit(balance);
                    break;
                case 4:        
                    System.out.println("ENTER AMOUTN ");
                    balance=sc.nextFloat();
                    b.withdraw(balance);
                    break;

                case 5: return ;   
                default:
                    break;
            }
        }
    }
}
 