import java.util.Scanner;

public class Bank
{
    public String name,address;
    public static int count=1000;
    public int accountNumber;
    public float balance;

    public Bank(){}

    public Bank(String name,String add,float amt)
    {
        this.name=name;
        this.address=add;
        this.accountNumber=++count;
        this.balance=amt;
    }

    public void display()
    {
        System.out.println("Name : "+this.name);
        System.out.println("Address : "+this.address);
        System.out.println("Balance : "+this.balance);
        System.out.println("Account Number : "+this.accountNumber);

    } 

    public void changeAddress(String newAdd)
    {
        this.address=newAdd;
        System.out.println("New address is : "+this.address);
    }

    public void creditMoney(float amt)
    {
        this.balance+=amt;
        System.out.println(amt+" has been credited to account "+this.accountNumber);
    }

    public void withdrawMoney(float amt)
    {
        if(amt>this.balance)
        {
            System.out.println("Not enough Money ");
        }
        else
        {
            this.balance-=amt;
            System.out.println(amt+" has been withdrawn from account "+this.accountNumber);
        }
    }

    public String getName()
    {
        return this.name;
    }

    public static void main(String [] args)
    {
        Bank arr[]=new Bank[5];
        int i=0;
        int choice;
        Scanner sc=new Scanner(System.in);
        do
        {
            System.out.println("Press\n1. To create Bank account\n2. To See your info\n3. To Deposit Money\n4. To Withdraw Money\n5. To Change your address\n6. EXIT");
            choice=sc.nextInt();
            
            sc.nextLine();
            switch (choice) {
                case 1:
                    {
                        String name,add;
                        System.out.println("Enter your name : ");
                        name=sc.nextLine();
                        System.out.println("Enter your address : ");
                        add=sc.nextLine();
                        System.out.println("Enter the amount : ");
                        float amt; 
                        amt=sc.nextFloat();
                        arr[i]=new Bank(name,add,amt);
                        i++;
                    }
                    break;

                case 2: 
                    {
                        String name;
                        System.out.println("Enter name to see info : ");
                        name=sc.nextLine();

                        boolean found=false;

                        for(int j=0;j<i;j++)
                        {
                            if(arr[j].getName().equals(name))
                            {
                                arr[j].display();
                                found=true;
                            }
                        }

                        if(!found)
                        {
                            System.out.println("Name does not exist.");
                        }
                    } 
                    break;
                case 3: 
                    {

                        String name;
                        System.out.println("Enter name to deposit money : ");
                        name=sc.nextLine();

                        boolean found=false;

                        for(int j=0;j<i;j++)
                        {
                            if(arr[j].getName().equals(name))
                            {
                                float amt;
                                System.out.println("Enter amount to deposit : ");

                                amt=sc.nextFloat();
                                sc.nextLine();

                                arr[j].creditMoney(amt);
                                found=true;
                            }
                        }

                        if(!found)
                        {
                            System.out.println("Name does not exist.");
                        }
                        break;
                    } 
                    
                case 4:
                    {
                        String name;
                        System.out.println("Enter name to withdraw Money : ");
                        name=sc.nextLine();

                        boolean found=false;

                        for(int j=0;j<i;j++)
                        {
                            if(arr[j].getName().equals(name))
                            {
                                float amt;
                                System.out.println("Enter amount to withdraw : ");
                                amt=sc.nextFloat();

                                sc.nextLine();

                                arr[j].withdrawMoney(amt);
                                found=true;
                            }
                        }

                        if(!found)
                        {
                            System.out.println("Name does not exist.");
                        }
                        break;
                    }    

                case 5 : 
                    {
                        String name;
                        System.out.println("Enter name to change address : ");
                        name=sc.nextLine();

                        boolean found=false;

                        for(int j=0;j<i;j++)
                        {
                            if(arr[j].getName().equals(name))
                            {
                                String add;
                                System.out.println("Enter your new Address : ");
                                add=sc.nextLine();
                                arr[j].changeAddress(add);
                                found=true;
                            }
                        }

                        if(!found)
                        {
                            System.out.println("Name does not exist.");
                        }
                        break;
                    }
                case 6 : 
                    {
                        System.out.println("Exiting...");
                        break;
                    }        
            
                default:
                    break;
            }

        }while(choice!=6); 
        sc.close();
    }

}
 