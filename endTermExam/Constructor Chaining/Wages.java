import java.util.*;
class Worker {
    protected String name;
    protected int basicWage;
    public Worker(String name,int basicWage)
    {
        this.name=name;
        this.basicWage=basicWage;
    }
    protected void display()
    {
        System.out.println("Name : "+this.name+" Basic Pay : "+this.basicWage);
    }    
}
public class Wages extends Worker
{
    int h,r;
    Wages(String name,int bp,int h,int r)
    {
        super(name,bp);
        this.h=h;
        this.r=r;
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);

        String name;
        System.out.println("Enter your name : ");
        name=sc.nextLine();
        
        int bp;
        System.out.println("Enter your basic pay : ");
        bp=sc.nextInt(); 

        int h,r;
        System.out.println("Enter the overtime period : ");
        h=sc.nextInt();
        System.out.println("Enter your rate : ");
        r=sc.nextInt();

        Wages wage=new Wages(name,bp,h,r);

        System.out.println("YOUR MONTHLY WAGE IS : "+wage.basicWage+h*r);

        System.out.println("EXITING THE PROGRAM----");

    }
}