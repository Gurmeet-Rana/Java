import java.util.Scanner;

class Fruit
{
    String name;
    double price;

    public Fruit(String name,double price)
    {
        this.name=name;
        this.price=price;
    }
} 

class Fruitingms extends Fruit
{
    double available_kgs;

    public Fruitingms(String name,double price,double available_kgs)
    {
        super(name,price);
        this.available_kgs=available_kgs;
    }
    public boolean Check_availability(double need)
    {
        return available_kgs>=need;
    }
    public void update_availability(double need)
    {
        if(Check_availability(need))
        {
            available_kgs-=need;
        }
    }
}

class Fruitinpcs extends Fruit
{
    int available_pcs;

    public Fruitinpcs(String name,double price,int available_pcs)
    {
        super(name,price);
        this.available_pcs=available_pcs;
    }
    public boolean Check_availability(int need)
    {
        return available_pcs>=need;
    }
    public void update_availability(int need)
    {
        if(Check_availability(need))
        {
            available_pcs-=need;
        }
    }
}

class Sale
{
    private double Discount(double amount)
    {
        return amount-(amount*0.05);
    }

    public double Bill(Fruit fruit,double quantity)
    {
        double amount=fruit.price*quantity;
        if(amount>500)
        {
            amount-=Discount(amount);
        }
        return amount;
    }
}

public class Demo
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in); 
        Fruitingms apple=new Fruitingms("Apple",150,10);
        Fruitinpcs banana=new Fruitinpcs("Banana", 10, 50);
        Sale sale=new Sale();
        while(true)
        {
            System.out.println("\n===== XYZ Fruit Shop======");
            System.out.println("1. Buy Apples (per kg)");
            System.out.println("2. Buy Bananas(per piece)");
            System.out.println("3. Exit");
            System.out.println("Enter your Choice : ");
            int choice=sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter quantity(kg):");
                    double applyQty=sc.nextDouble();
                    if(apple.Check_availability(applyQty))
                    {
                        double billAmt=sale.Bill(apple, applyQty);
                        apple.update_availability(applyQty);

                        System.out.println("Total Bill for "+applyQty+" Kg Apple :  "+billAmt);

                    } 
                    else
                    {
                        System.out.println("Apples not available in required quantity.");
                    }
                    break;
                
                case 2:
                    System.out.println("Enter quantity(pieces) : ");
                    int bananaQty=sc.nextInt();
                    if(banana.Check_availability(bananaQty))
                    {
                        double billAmt=sale.Bill(banana, bananaQty);
                        banana.update_availability(bananaQty);
                        System.out.println("Total Bill for "+bananaQty+" Bananas : "+billAmt);
                    }
                    else
                    {
                        System.out.println("Bananas not available in required quantity .");
                    }
                    break;    

                case 3 : 
                    System.out.println("Thank you for shopping with XYZ Fruit Shop! EXITING....");
                    sc.close();
                    return;    
            
                default:
                    break;
            }
        }
    }
}